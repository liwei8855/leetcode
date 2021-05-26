package 装饰模式;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();
        a.setComponent(c);
        b.setComponent(a);
        b.Operation();
    }
}
