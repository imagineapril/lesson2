package inno.timokhina.lesson01.task01;

public class Main {
    public static void main(String[] args) {
        int gasPrice = 43; // Стоимость одного литра бензина
        int gasCount = 50; // Количество литров
        int cost = gasPrice * gasCount; // Итоговая стоимость
        System.out.println("Стоимость " + gasCount + " л. бензина составляет " + cost + " рублей.");
    }
}
