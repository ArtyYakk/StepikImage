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
    static int yCar = 10;
    static double angleCar = 0;
    static boolean flagOne = true;
    static boolean flagTwo = true;
    static boolean flagThree = true;

//РАКЕТА РАКЕТА РАКЕТА РАКЕТА РАКЕТА РАКЕТА РАКЕТА РАКЕТА РАКЕТА РАКЕТА РАКЕТА
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

//МАШИНА МАШИНА МАШИНА МАШИНА МАШИНА МАШИНА МАШИНА МАШИНА МАШИНА МАШИНА МАШИНА
    public static void moveCar(){
        JFrame frame = new JFrame("Машина");
        frame.setLocation(1120,240);
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Car aa = new Car(xCar,yCar,angleCar);

        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if((!flagTwo)&&(xCar < 349)){
                    if(flagThree){
                        xCar -= aa.img.getHeight();
                        flagThree = false;
                    }
                    angleCar = Math.PI*1.5;
                    yCar -= 2;
                    if(yCar < 350){
                        flagTwo = true;
                        flagThree = true;
                        angleCar = 0;
                        yCar -= aa.img.getHeight();
                    }
                }else if(yCar > 410){
                    if(flagTwo){
                        yCar += aa.img.getHeight();
                        flagTwo = false;
                        flagOne = true;
                    }
                    angleCar = Math.PI;
                    xCar -= 2;
                } else if(xCar > 432){
                    if(flagOne){
                        xCar += aa.img.getHeight();
                        flagOne = false;
                    }
                    angleCar = Math.PI/2;
                    yCar += 2;
                } else xCar += 2;

                System.out.println(xCar + " " + yCar);
                frame.add(new Car(xCar,yCar,angleCar));
                frame.setVisible(true);
                frame.pack();
            }
        };
        Timer timer = new Timer(10, listener);
        timer.start();



        frame.add(aa);
        frame.setVisible(true);
        frame.pack();
    }
}