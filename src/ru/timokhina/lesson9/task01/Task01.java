package ru.timokhina.lesson9.task01;

public class Task01 {
    public static void main(String[] args){

        Unicorn unicorn = new Unicorn();
        System.out.println(unicorn.getName());
        fly(unicorn);
        run(unicorn);

        Racoon raccon = new Racoon();
        System.out.println(raccon.getName());
        run(raccon);
        swim(raccon);

    }

    private static void fly(Flyable flyable) {
        flyable.fly();
    }

    private static void run(Runable runable) {
        runable.run();
    }

    private static void swim(Swimable swimable) {
        swimable.swim();
    }

}
