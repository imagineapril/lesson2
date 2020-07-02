package inno.timokhina.lesson01.task02;

public class salary {
    public static void main(String[] args) {
        int salary = 70000; // Зарплата до вычетов
        int takehomepay = salary - salary / 100 * 13;// Зарплата на руки
        System.out.println("Зарплата на руки составляет " + takehomepay + " рублей.");
    }
}
