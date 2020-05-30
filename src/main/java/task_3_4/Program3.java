package task_3_4;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Введите слово, начинающееся на букву \"А\"");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char a1= a.charAt(0);
        while (a1 !='А') {
            System.out.println("Слово не начинается с А, введите еще раз");
            a = scanner.nextLine();
            a1= a.charAt(0);

            }
            System.out.println("Спасибо, до свидания!");
            System.exit(0);

        }


    }

