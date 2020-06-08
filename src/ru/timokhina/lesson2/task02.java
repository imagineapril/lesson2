package ru.timokhina.lesson2;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите зарплату до вычета:");
        int salary = in.nextInt();
        int takehomepay = salary - salary / 100 * 13;// Зарплата на руки
        System.out.println("Зарплата на руки составляет " + takehomepay + " рублей.");
    }
}
