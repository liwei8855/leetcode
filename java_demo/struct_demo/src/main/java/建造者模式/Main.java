package 建造者模式;
import java.awt.Graphics;
import java.awt.Graphics2D;

import sun.print.PathGraphics;

public class Main {

    public static void main(String[] args) {
        Graphics g = null;
        Pen p = new Pen();//随便创建的参数类 没什么用

        PersonThinBuilder thin = new PersonThinBuilder(g,p);
        PersonDirector director = new PersonDirector(thin);
        director.CreatePerson();

    }

}
