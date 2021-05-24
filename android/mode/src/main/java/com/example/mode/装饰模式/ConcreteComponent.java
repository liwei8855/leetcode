package com.example.mode.装饰模式;

import com.sun.org.apache.xpath.internal.operations.Operation;

import java.io.Console;

public class ConcreteComponent extends Component {

    @Override
    public void Operation() {
        System.out.println("对象操作");
    }
}
