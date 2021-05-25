package com.example.mode.建造者模式;

import java.awt.Graphics;
//concrete builder1
public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Graphics g,Pen p){
        super(g,p);

    }

    private Pen pen = new Pen();

    @Override
    public void BuildHead() {
        g.drawRect(20,50,100,100);
    }

    @Override
    public void BuildBody() {
        g.drawRect(60,50,10,50);
    }

    @Override
    public void BuildArmLeft() {
        g.drawLine(60,50,40,100);
    }

    @Override
    public void BuildArmRight() {
        g.drawLine(70,50,90,100);
    }

    @Override
    public void BuildLegLeft() {
        g.drawLine(60,100,45,150);
    }

    @Override
    public void BuildLegRight() {
        g.drawLine(70,100,85,150);
    }

    @Override
    public Pen GetResult() {
        return pen;
    }
}