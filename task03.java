package ru.timokhina.lesson2;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите секунды:");
        int sec = in.nextInt();
        int hour = sec / 3600;// Минуты
        System.out.println(sec + " секунд - это  " + hour + " минута.");
    }
}
