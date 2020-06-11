package ru.timokhina.lesson4;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int num1 = in.nextInt();
        System.out.print("Введите второе число:");
        int num2 = in.nextInt();

        if(num1<=num2) {
            System.out.println(num1 + " - минимальное число");
        }
        else
        System.out.println(num2 + " - минимальное число");
    }
}
