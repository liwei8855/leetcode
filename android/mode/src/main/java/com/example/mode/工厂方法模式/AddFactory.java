package com.example.mode.工厂方法模式;

public class AddFactory implements IFactory {

    @Override
    public Operation CreateOperation() {
        return new OperationAdd();
    }
}
