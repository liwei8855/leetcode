package 装饰模式;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB() {
    }

    public void Operation() {
        super.Operation();
        this.AddedBehavior();
        System.out.print("装饰对象B的操作");
    }

    private void AddedBehavior() {
        System.out.println("B:addedBehavior");
    }
}
