package ru.timokhina.lesson4;
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N:");
        int n = in.nextInt();
        int z = 0;
        for (int i = 1; i < n; i++ ) {
            System.out.println(z);
            // арифметическая прогрессия с шагом 2
            z = z + 2;
        }
    }
}
