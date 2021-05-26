package 工厂方法模式;

public class Main {

    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.CreateOperation();
        oper.numberA = 1.0D;
        oper.numberB = 2.0D;
        double result = oper.getResult();
        System.out.println(result);
    }
}
