package ru.timokhina.lesson4;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int num = in.nextInt();

        if(num<0) {
            if(num%2==0)
            System.out.println(num + " - отрицательное чётное число");
            else System.out.println(num + " - отрицательное нечётное число");
        }
        else
            if(num>0)
                if(num%2==0)
                System.out.println(num + " - положительное чётное число");
                else System.out.println(num + " - положительное нечётное число");
            else System.out.println(num + " - нулевое число");
    }
}
