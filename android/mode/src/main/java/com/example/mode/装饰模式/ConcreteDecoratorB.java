package com.example.mode.装饰模式;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.print("装饰对象B的操作");
    }

    private void AddedBehavior() {
        System.out.println("B:addedBehavior");
    }
}
