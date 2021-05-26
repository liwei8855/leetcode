package 建造者模式;
import java.awt.Graphics;

public class PersonFatBuilder extends PersonBuilder {
    public PersonFatBuilder(Graphics g, Pen p) {
        super(g, p);
    }

    private Pen pen = new Pen();

    @Override
    public void BuildHead() {

    }

    @Override
    public void BuildBody() {

    }

    @Override
    public void BuildArmLeft() {

    }

    @Override
    public void BuildArmRight() {

    }

    @Override
    public void BuildLegLeft() {

    }

    @Override
    public void BuildLegRight() {

    }

    @Override
    public Pen GetResult() {
        return pen;
    }
}
