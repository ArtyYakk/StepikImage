import figures.Car;
import figures.Rocket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Move extends JFrame {
    static int xRock = -174;
    static int yRock = -174;
    static int xCar = 0;
    static int yCar = 0;

    public static void moveRocket(){
        JFrame frame = new JFrame("Ракета");
        frame.setLocation(1120,240);
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Rocket aa = new Rocket(xRock,yRock);

        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                if(xRock <= 780){
                    xRock += 2;
                    yRock += 2;
                }
                else{
                    xRock = -174;
                    yRock = -174;
                }
                System.out.println(xRock + " " + yRock);
                frame.add(new Rocket(xRock,yRock));
                frame.setVisible(true);
                frame.pack();
            }
        };
        Timer timer = new Timer(1, listener);
        timer.start();

        frame.add(aa);
        frame.setVisible(true);
        frame.pack();
    }

    public static void moveCar(){
        JFrame frame = new JFrame("Ракета");
        frame.setLocation(1120,240);
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Car aa = new Car(xCar,yCar);

        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                if(xRock <= 780){
                    xRock += 2;
                    yRock += 2;
                }
                else{
                    xRock = -174;
                    yRock = -174;
                }
                System.out.println(xRock + " " + yRock);

                frame.add(new Car(xRock,yRock));
                frame.setVisible(true);
                frame.pack();
            }
        };
        Timer timer = new Timer(1, listener);
        timer.start();

        frame.add(aa);
        frame.setVisible(true);
        frame.pack();
    }
}
