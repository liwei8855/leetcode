package 装饰模式;

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    public ConcreteDecoratorA() {
    }

    public void Operation() {
        super.Operation();
        this.addedState = "New State";
        System.out.println("装饰对象a的操作");
    }
}
