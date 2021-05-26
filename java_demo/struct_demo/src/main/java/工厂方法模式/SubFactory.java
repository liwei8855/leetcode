package 工厂方法模式;

public class SubFactory implements IFactory {
    public SubFactory() {
    }

    public Operation CreateOperation() {
        return new OperationSub();
    }
}
