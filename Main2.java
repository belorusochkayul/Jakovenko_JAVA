import java.io.File;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите директорию:");
        String dirName = sc.nextLine();
        File dir = new File(dirName);
        if (dir.exists()) {
            System.out.println("Папка существует");
        } else {
            System.out.println("Папка не сущеcтвует");
            return;
        }
        File[] fileArray = dir.listFiles();

        while (true) {
            System.out.println("Выберите действие c указанной директорией:1-вывести содержимое директории; 2-удалить файл по имени; 3-вывести список файлов внутренней директории; 4-выход из программы");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    for (File file : fileArray) {
                        if (file.isDirectory()) {
                            System.out.println("это папка  " + file.getName());
                        } else {
                            System.out.println("это файл  " + file.getName());
                        }
                    }
                }
                case 2 -> {
                    Scanner sca = new Scanner(System.in);
                    System.out.println("Введите название файла, который необходимо удалить: ");
                    String fileNameForDelete = sca.nextLine();
                    File serchfile = new File(dir, fileNameForDelete);
                    if (serchfile.exists() && serchfile.isFile()) {
                        System.out.println("Такой файл существует");
                        boolean deleteResult = serchfile.delete();
                        if (deleteResult) {
                            System.out.println("Файл успешно удален");
                        }
                    } else {
                        System.out.println("Такого файла нет в даннной директории");
                    }
                    break;
                }
                case 3 -> {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Введите название внутренней директории, список файлов из которой нужно вывести на экран:");
                    String innerFolderName = scan.nextLine();
                    File innerDir = new File(dir, innerFolderName);
                    File[] fileArrayInFolder = innerDir.listFiles();
                    if (fileArrayInFolder == null) {
                        System.out.println("Папка пустая");
                        return;
                    }
                    System.out.println("Список файлов внутри директории " + innerFolderName + ":");
                    for (File fileIn : fileArrayInFolder) {
                        System.out.println(" " + fileIn.getName());
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("Программа завершена");
                    return;
                }
                default -> {
                    System.out.println("Ваш выбор некорректен,выберите один из двух предложенных вариантов");
                }
            }
        }
    }
}