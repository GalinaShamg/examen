package task8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полный путь, откуда копировать");
        String path = scanner.nextLine();
        Path pathFile1 = Paths.get(path);

        System.out.println("Введите полный путь, куда копировать");
        String path2 = scanner.nextLine();
        Path pathFile2 = Paths.get(path2);

        try (FileInputStream fileInputStream = new FileInputStream(String.valueOf(pathFile1));
             FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(pathFile2))) {
            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
