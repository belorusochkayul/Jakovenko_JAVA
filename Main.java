import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к директории файла-источника:");
        String dirFileSource = sc.nextLine();
        File file1 = new File(dirFileSource);
        if (file1.exists() && file1.isDirectory()) {
            System.out.println("Папка существует");
            System.out.println("Введите имя файла-источника");
            String fileSourse = sc.nextLine();
            File file2 = new File(dirFileSource, fileSourse);
            if (file2.exists() && file2.isFile()) {
                System.out.println("Файл-источник существует");
                String fileDest = "/copy_" + fileSourse;
                File fileNew = new File(dirFileSource, fileDest);
                try {
                    copyFile(file2, fileNew);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Такого файла не существует");
            }
        } else {
            System.out.println("Папки не существует");
        }
    }

    private static void copyFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            int numberOfBytes = 2 ^ 30; // 1GB
            byte[] bytes = new byte[numberOfBytes];
            int length;
            while ((length = is.read(bytes)) > 0) {
                os.write(bytes, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}