package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        System.out.println("Введите число");
        int m = scanner.nextInt();

        int[][] a = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j%2!=0){
                    a[i][j]=j;
                }
             }
        }

        for(int c =0; c<a.length; c++){
                for (int b=0; b<a[c].length;b++){
                System.out.println(a[c][b]);
            }
        }

    }
}
