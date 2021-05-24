package com.example.mode.装饰模式;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("装饰对象a的操作");
    }
}
