package ru.timokhina.lesson9.task01;

public class Racoon extends Animal implements Runable, Swimable {


    @Override
    public String getName() {

        return "Racoon";
    }

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
