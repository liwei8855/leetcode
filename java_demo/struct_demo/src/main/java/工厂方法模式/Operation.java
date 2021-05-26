package 工厂方法模式;

public abstract class Operation {
    protected double numberA;
    protected double numberB;

    public Operation() {
    }

    public abstract double getResult();
}
