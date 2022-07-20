package figures;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TrueSun extends JPanel{
    BufferedImage sun;
    BufferedImage mercury;
    BufferedImage venus;
    BufferedImage earth;
    BufferedImage mars;
    BufferedImage upiter;
    BufferedImage saturn;
    BufferedImage uran;
    BufferedImage neptun;
    BufferedImage pluton;
    private final int xSun;
    private final int ySun;
    private final int xMercury;
    private final int yMercury;
    private final int xVenus;
    private final int yVenus;
    private final int xEarth;
    private final int yEarth;
    private final int xMars;
    private final int yMars;
    private final int xUpiter;
    private final int yUpiter;
    private final int xSaturn;
    private final int ySaturn;
    private final int xUran;
    private final int yUran;
    private final int xNeptun;
    private final int yNeptun;
    private final int xPluton;
    private final int yPluton;;

    public TrueSun(int xSun, int ySun, int xMercury, int yMercury, int xVenus, int yVenus,int xEarth, int yEarth,
                   int xMars, int yMars,int xUpiter, int yUpiter,int xSaturn, int ySaturn,int xUran, int yUran,
                   int xNeptun, int yNeptun,int xPluton, int yPluton, BufferedImage sun, BufferedImage mercury,
                   BufferedImage venus, BufferedImage earth, BufferedImage mars, BufferedImage upiter,
                   BufferedImage saturn, BufferedImage uran, BufferedImage neptun, BufferedImage pluton) {
        this.sun = sun;
        this.mercury = mercury;
        this.venus = venus;
        this.earth = earth;
        this.mars = mars;
        this.upiter = upiter;
        this.saturn = saturn;
        this.uran = uran;
        this.neptun = neptun;
        this.pluton = pluton;

        this.xSun = xSun;
        this.ySun = ySun;
        this.xMercury = xMercury;
        this.yMercury = yMercury;
        this.xVenus = xVenus;
        this.yVenus = yVenus;
        this.xEarth = xEarth;
        this.yEarth = yEarth;
        this.xMars = xMars;
        this.yMars = yMars;
        this.xUpiter = xUpiter;
        this.yUpiter = yUpiter;
        this.xSaturn = xSaturn;
        this.ySaturn = ySaturn;
        this.xUran = xUran;
        this.yUran = yUran;
        this.xNeptun = xNeptun;
        this.yNeptun = yNeptun;
        this.xPluton = xPluton;
        this.yPluton = yPluton;
        setBackground(new Color(0));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sun.getScaledInstance(sun.getWidth()/6, sun.getHeight()/6, //SUN
                        Image.SCALE_DEFAULT), xSun, ySun, TrueSun.this);
        g.drawImage(mercury.getScaledInstance(mercury.getWidth()/18, mercury.getHeight()/18,
                        Image.SCALE_DEFAULT), xMercury, yMercury, TrueSun.this);
        g.drawImage(venus.getScaledInstance(venus.getWidth()/16, venus.getHeight()/16,
                        Image.SCALE_DEFAULT), xVenus, yVenus, TrueSun.this);
        g.drawImage(earth.getScaledInstance(earth.getWidth()/11, earth.getHeight()/11,
                        Image.SCALE_DEFAULT), xEarth, yEarth, TrueSun.this);
        g.drawImage(mars.getScaledInstance(mars.getWidth()/15, mars.getHeight()/15,
                        Image.SCALE_DEFAULT), xMars, yMars, TrueSun.this);
        g.drawImage(upiter.getScaledInstance(upiter.getWidth()/8, upiter.getHeight()/8,
                        Image.SCALE_DEFAULT), xUpiter, yUpiter, TrueSun.this);
        g.drawImage(saturn.getScaledInstance(saturn.getWidth()/6, saturn.getHeight()/6,
                        Image.SCALE_DEFAULT), xSaturn, ySaturn, TrueSun.this);
        g.drawImage(uran.getScaledInstance(uran.getWidth()/10, uran.getHeight()/10,
                        Image.SCALE_DEFAULT), xUran, yUran, TrueSun.this);
        g.drawImage(neptun.getScaledInstance(neptun.getWidth()/12, neptun.getHeight()/12,
                        Image.SCALE_DEFAULT), xNeptun, yNeptun, TrueSun.this);
        g.drawImage(pluton.getScaledInstance(pluton.getWidth()/30, pluton.getHeight()/30,
                        Image.SCALE_DEFAULT), xPluton, yPluton, TrueSun.this);
    }
}
