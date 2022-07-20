import figures.TrueSun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TrueSunSystem extends JFrame {
    static int xSun = 450;
    static int ySun = 400;
    static int xMercury;
    static int yMercury;
    static int xVenus;
    static int yVenus;
    static int xEarth;
    static int yEarth;
    static int xMars;
    static int yMars;
    static int xUpiter;
    static int yUpiter;
    static int xSaturn;
    static int ySaturn;
    static int xUran;
    static int yUran;
    static int xNeptun;
    static int yNeptun;
    static int xPluton;
    static int yPluton;
    static int t1 = 0;
    static int t2 = 0;
    static int t3 = 0;
    static int t4 = 0;
    static int t5 = 0;
    static int t6 = 0;
    static int t7 = 0;
    static int t8 = 0;
    static int t9 = 0;
    public static BufferedImage sun;
    public static BufferedImage mercury;
    public static BufferedImage venus;
    public static BufferedImage earth;
    public static BufferedImage mars;
    public static BufferedImage upiter;
    public static BufferedImage saturn;
    public static BufferedImage uran;
    public static BufferedImage neptun;
    public static BufferedImage pluton;
    static ThrA procA;
    static ThrB procB;
    static ThrC procC;

    static {
        try {
            sun = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\sun0.png"));
            mercury = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\mercury1.png"));
            venus = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\venus2.png"));
            earth = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\earth3.png"));
            mars = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\mars4.png"));
            upiter = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\upiter5.png"));
            saturn = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\saturn6.png"));
            uran = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\uran7.png"));
            neptun = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\neptun8.png"));
            pluton = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\pluton9.png"));
        } catch (IOException e) {
            System.out.println("Ошибка ввода изображения");
        }
    }


    public static void moveSun(){
        JFrame frame = new JFrame("Солнце и Земля");
        frame.setLocation(600,20);
        frame.setPreferredSize(new Dimension(1100,1000));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                procA = new ThrA();
                procB = new ThrB();
                procC = new ThrC();
                Thread threadA = new Thread(procA);
                Thread threadB = new Thread(procB);
                Thread threadC = new Thread(procC);
                threadA.start();
                threadB.start();
                threadC.start();
                frame.getContentPane().add(new TrueSun(xSun, ySun, xMercury, yMercury, xVenus, yVenus,xEarth,
                        yEarth, xMars, yMars,xUpiter, yUpiter,xSaturn, ySaturn, xUran, yUran, xNeptun, yNeptun,
                        xPluton, yPluton, sun, mercury, venus, earth, mars, upiter, saturn, uran,
                        neptun, pluton));
                frame.setVisible(true);
                frame.pack();
            }
        };

        Timer timer = new Timer(1, listener);
        timer.start();

    }


    static class ThrA implements Runnable{
        @Override
        public void run() {
            if(t1 >= 360) t1 = 0;
            if(t2 >= 360) t2 = 0;
            if(t3 >= 360) t3 = 0;

            t1 += 17;
            t2 += 15;
            t3 += 13;

            xMercury = (int)(xSun+sun.getWidth()/12-mercury.getWidth()/36 + 70*(Math.cos(t1*Math.PI/180.0)));
            yMercury = (int)(ySun+sun.getHeight()/12-mercury.getHeight()/36 + 70*(Math.sin(t1*Math.PI/180.0)));

            xVenus = (int)(xSun+sun.getWidth()/12-venus.getWidth()/32 + 115*(Math.cos(t2*Math.PI/180.0)));
            yVenus = (int)(ySun+sun.getHeight()/12-venus.getHeight()/32 + 115*(Math.sin(t2*Math.PI/180.0)));

            xEarth = (int)(xSun+sun.getWidth()/12-earth.getWidth()/22 + 175*(Math.cos(t3*Math.PI/180.0)));
            yEarth = (int)(ySun+sun.getHeight()/12-earth.getHeight()/22 + 175*(Math.sin(t3*Math.PI/180.0)));

        }
    }
    static class ThrB implements Runnable{
        @Override
        public void run() {
            if(t4 >= 360) t4 = 0;
            if(t5 >= 360) t5 = 0;
            if(t6 >= 360) t6 = 0;

            t4 += 11;
            t5 += 9;
            t6 += 7;

            xMars = (int)(xSun+sun.getWidth()/12-mars.getWidth()/30 + 234*(Math.cos(t4*Math.PI/180.0)));
            yMars = (int)(ySun+sun.getHeight()/12-mars.getHeight()/30 + 234*(Math.sin(t4*Math.PI/180.0)));

            xUpiter = (int)(xSun+sun.getWidth()/12-upiter.getWidth()/16 + 305*(Math.cos(t5*Math.PI/180.0)));
            yUpiter = (int)(ySun+sun.getHeight()/12-upiter.getHeight()/16 + 305*(Math.sin(t5*Math.PI/180.0)));

            xSaturn = (int)(xSun+sun.getWidth()/12-saturn.getWidth()/12 + 388*(Math.cos(t6*Math.PI/180.0)));
            ySaturn = (int)(ySun+sun.getHeight()/12-saturn.getHeight()/12 + 388*(Math.sin(t6*Math.PI/180.0)));
        }
    }

    static class ThrC implements Runnable{
        @Override
        public void run() {
            if(t7 >= 360) t7 = 0;
            if(t8 >= 360) t8 = 0;
            if(t9 >= 360) t9 = 0;

            t7 += 5;
            t8 += 3;
            t9 += 1;

            xUran = (int)(xSun+sun.getWidth()/12-uran.getWidth()/20 + 458*(Math.cos(t7*Math.PI/180.0)));
            yUran = (int)(ySun+sun.getHeight()/12-uran.getHeight()/20 + 458*(Math.sin(t7*Math.PI/180.0)));

            xNeptun = (int)(xSun+sun.getWidth()/12-neptun.getWidth()/24 + 510*(Math.cos(t8*Math.PI/180.0)));
            yNeptun = (int)(ySun+sun.getHeight()/12-neptun.getHeight()/24 + 510*(Math.sin(t8*Math.PI/180.0)));

            xPluton = (int)(xSun+sun.getWidth()/12-pluton.getWidth()/60 + 554*(Math.cos(t9*Math.PI/180.0)));
            yPluton = (int)(ySun+sun.getHeight()/12-pluton.getHeight()/60 + 554*(Math.sin(t9*Math.PI/180.0)));

        }
    }
}

