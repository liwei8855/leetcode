package com.example.mode.工厂方法模式;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return numberA+numberB;
    }
}
