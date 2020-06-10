package ru.timokhina.lesson2;
import java.util.Scanner;
import java.util.Random;

public class task04 {
    public static void main(String[] args) {
        Random random = new Random();
        int pickedNumber = 0 + random.nextInt(10 - 0);
        Scanner in = new Scanner(System.in);
        int guessedNumber;
        boolean win = false;

        while (win == false){
        System.out.print("Попробуйте угадать загаданное компьютером число от 0 до 10:");
        guessedNumber = in.nextInt();
            if (pickedNumber == guessedNumber) {
                System.out.print("Вы угадали число!");
                break;
            }
            else if (Math.abs(pickedNumber - guessedNumber) >= 3) {
                System.out.print("Холодно. ");
            }
            else if (Math.abs(pickedNumber - guessedNumber) < 3) {
                System.out.print("Горячо. ");
            }
        }


        }
}
