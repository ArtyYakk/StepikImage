import figures.Sun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SunSystem extends JFrame {
    static int xSun = 270;
    static int ySun = 270;
    static int xEarth;
    static int yEarth;
    static int t = 0;
    public static BufferedImage sun;
    public static BufferedImage earth;

    static {
        try {
            sun = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\sun.png"));
            earth = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\earth.png"));
        } catch (IOException e) {
            System.out.println("Ошибка ввода изображения");
        }
    }

    public static void moveSun(){
        JFrame frame = new JFrame("Солнце и Земля");
        frame.setLocation(1120,240);
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t >= 360) t = 0;
                t += 5;
                xEarth = (int)(xSun+sun.getWidth()/8-earth.getWidth()/12 + 300*(Math.cos(t*Math.PI/180.0)));
                yEarth = (int)(ySun+sun.getHeight()/8-earth.getHeight()/12 + 300*(Math.sin(t*Math.PI/180.0)));

                System.out.println(xEarth + " " + yEarth + " " + t);
                frame.getContentPane().add(new Sun(xSun,ySun,xEarth,yEarth,sun,earth));
                frame.setVisible(true);
                frame.pack();
            }
        };

        Timer timer = new Timer(1, listener);
        timer.start();

    }
}
