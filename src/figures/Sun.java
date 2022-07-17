package figures;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Sun extends JPanel {
    BufferedImage sun;
    BufferedImage earth;
    private final int xSun;
    private final int ySun;
    private final int xEarth;
    private final int yEarth;

    public Sun(int xSun, int ySun,int xEarth, int yEarth, BufferedImage sun, BufferedImage earth) {
        this.sun = sun;
        this.earth = earth;
        this.xSun = xSun;
        this.ySun = ySun;
        this.xEarth = xEarth;
        this.yEarth = yEarth;
        setBackground(new Color(0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sun.getScaledInstance(sun.getWidth()/4, sun.getHeight()/4,
                Image.SCALE_DEFAULT), xSun, ySun, this);
        g.drawImage(earth.getScaledInstance(earth.getWidth()/6, earth.getHeight()/6,
                Image.SCALE_DEFAULT), xEarth, yEarth, this);
    }
}
