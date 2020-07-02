package ru.timokhina.lesson9.task01;

public class Unicorn extends Animal implements Flyable, Runable {

    @Override
    public String getName() {
        return "Unicorn";
    }


    @Override
    public void fly() {
        System.out.println("I can fly");

    }

    @Override
    public void run() {
        System.out.println("I can run");

    }
}
