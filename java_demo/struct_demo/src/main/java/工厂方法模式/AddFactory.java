package 工厂方法模式;

public class AddFactory implements IFactory {
    public AddFactory() {
    }

    public Operation CreateOperation() {
        return new OperationAdd();
    }
}
