package ru.timokhina.lesson2;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цену 1 литра:");
        int gasPrice = in.nextInt();
        System.out.print("Введите количество литров:");
        int gasCount = in.nextInt();
        int cost = gasPrice * gasCount; // Итоговая стоимость
        System.out.println("Стоимость " + gasCount + " л. бензина составляет " + cost + " рублей.");
    }
}
