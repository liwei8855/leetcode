package 工厂方法模式;

public class OperationSub extends Operation {
    public OperationSub() {
    }

    public double getResult() {
        return this.numberA - this.numberB;
    }
}
