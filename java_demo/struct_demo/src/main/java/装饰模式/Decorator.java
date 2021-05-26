package 装饰模式;

public abstract class Decorator extends Component {
    protected Component component;

    public Decorator() {
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public void Operation() {
        if (this.component != null) {
            this.component.Operation();
        }

    }
}
