package 工厂方法模式;

public class OperationAdd extends Operation {
    public OperationAdd() {
    }

    public double getResult() {
        return this.numberA + this.numberB;
    }
}
