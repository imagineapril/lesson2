package ru.timokhina.lesson9.task03;

public class Woman extends Human {

    @Override
    public void run() {
        System.out.println("I can run");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }
}
