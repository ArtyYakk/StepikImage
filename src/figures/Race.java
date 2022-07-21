package figures;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Race extends JPanel{
    BufferedImage one;
    BufferedImage two;
    BufferedImage three;
    BufferedImage four;
    BufferedImage five;

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int x3;
    private final int y3;
    private final int x4;
    private final int y4;
    private final int x5;
    private final int y5;
    public Race(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5,
                   int y5, BufferedImage one, BufferedImage two, BufferedImage three,
                BufferedImage four, BufferedImage five) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.x5 = x5;
        this.y5 = y5;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int koef = 2;
        int height = one.getHeight()/koef;
        int k2 = (int)(((double)height*two.getWidth())/two.getHeight());
        int k3 = (int)(((double)height*three.getWidth())/three.getHeight());
        int k4 = (int)(((double)height*four.getWidth())/four.getHeight());
        int k5 = (int)(((double)height*five.getWidth())/five.getHeight());

        g.drawImage(one.getScaledInstance(one.getWidth()/koef, height, Image.SCALE_DEFAULT),
                x1, y1,this);
        g.drawImage(two.getScaledInstance(k2, height, Image.SCALE_DEFAULT),
                x2, y2,this);
        g.drawImage(three.getScaledInstance(k3, height, Image.SCALE_DEFAULT),
                x3, y3,this);
        g.drawImage(four.getScaledInstance(k4, height, Image.SCALE_DEFAULT),
                x4, y4,this);
        g.drawImage(five.getScaledInstance(k5, height, Image.SCALE_DEFAULT),
                x5, y5,this);

    }
}
