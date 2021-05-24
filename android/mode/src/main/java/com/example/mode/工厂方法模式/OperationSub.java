package com.example.mode.工厂方法模式;

public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return numberA-numberB;
    }
}
