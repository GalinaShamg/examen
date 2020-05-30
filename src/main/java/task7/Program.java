package task7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n; i>0; i--){
            System.out.print(i +" ");
        }

    }
}
