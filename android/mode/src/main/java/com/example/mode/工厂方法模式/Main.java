package com.example.mode.工厂方法模式;

public class Main {
    public static void main(String[] args) {
       IFactory operFactory = new AddFactory();
       Operation oper = operFactory.CreateOperation();
       oper.numberA = 1;
       oper.numberB = 2;
       double result = oper.getResult();

       System.out.println(result);
    }
}
