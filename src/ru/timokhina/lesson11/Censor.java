package ru.timokhina.lesson12;

import java.util.Scanner;

public class Censor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку!");
        String uncensoredString = in.nextLine();
        String cut = "бяка";
        String censoredString = uncensoredString.replaceAll("бяка","вырезано цензурой");
        System.out.printf(censoredString);


    }
}