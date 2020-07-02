package ru.timokhina.lesson12.task03;

public class Task03 {
    public static void main(String[] args) throws Exception {
         {
             int a;
             int b;
             int dev;
             a = 10;
             b = 0;
            try {
                dev = a / b;
            }
            catch (Exception ex)    {
               throw new Exception("На ноль делить нельзя");
                }
         }
    }
}

