import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите директорию:");
        String dirName = sc.nextLine();
        File dir = new File(dirName);
        if (dir.exists()) {
            System.out.println("Папка существует");
        } else {
            System.out.println("Папка не сущеcтвует");
        }

        File[] fileArray = dir.listFiles();
        if (fileArray == null) {
            System.out.println("Папка пустая");
            return;
        }
        for (File file : fileArray) {
            if (file.isDirectory()) {
                System.out.println("это папка  " + file.getName());
            } else {
                System.out.println("это файл  " + file.getName());
            }
        }

        System.out.println("Введите название файла, который необходимо удалить: ");
        String fileNameForDelete = sc.nextLine();
        File serchfile = new File(dir, fileNameForDelete);
        if (serchfile.exists()) {
            System.out.println("Такой файл существует и он успешно удален");
            serchfile.delete();
        } else {
            System.out.println("Такого файла нет в даннной директории");
        }

        System.out.println("Введите название внутренней директории, список файлов из которой нужно вывести на экран:");
        String innerFolderName = sc.nextLine();
        File innerDir = new File(dirName + innerFolderName);
        File[] fileArrayInFolder = innerDir.listFiles();
        if (fileArrayInFolder == null) {
            System.out.println("Папка пустая");
            return;
        }
        System.out.println("Список файлов внутри директории " + innerFolderName + ":");
        for (File fileIn : fileArrayInFolder) {
            System.out.println(" " + fileIn.getName());
        }
    }
}