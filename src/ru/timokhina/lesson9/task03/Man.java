package ru.timokhina.lesson9.task03;

public class Man extends Human {

    @Override
    public void run() {
        System.out.println("I can run better");
    }

    @Override
    public void swim() {
        System.out.println("I can swim better");
    }
}
