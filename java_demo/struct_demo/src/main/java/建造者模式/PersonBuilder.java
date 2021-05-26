package 建造者模式;
import java.awt.Graphics;

public abstract class PersonBuilder {

    protected Graphics g;
    protected Pen p;
    public PersonBuilder(Graphics g, Pen p){
        this.g = g;
        this.p = p;
    }

    public abstract void BuildHead();
    public abstract void BuildBody();
    public abstract void BuildArmLeft();
    public abstract void BuildArmRight();
    public abstract void BuildLegLeft();
    public abstract void BuildLegRight();
    public abstract Pen GetResult();

}
