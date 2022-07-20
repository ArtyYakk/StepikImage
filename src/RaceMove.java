import figures.Race;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RaceMove extends JFrame {
    static int x1 = 15;
            static int y1 = 0;
    static int x2 = -35;
            static int y2 = 200;
    static int x3 = 60;
            static int y3 = 400;
    static int x4 = 60;
            static int y4 = 600;
    static int x5 = 60;
            static int y5 = 800;

    public static BufferedImage one;
    public static BufferedImage two;
    public static BufferedImage three;
    public static BufferedImage four;
    public static BufferedImage five;
    static Timer timer;
    static JFrame frame;
    static String winner;



    static {
        try {
            one = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\1.png"));
            two = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\2.png"));
            three = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\3.png"));
            four = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\4.png"));
            five = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\5.png"));
        } catch (IOException e) {
            System.out.println("Ошибка ввода изображения");
        }
    }


    public  void letsRace(){
        frame = new JFrame("Race");
        frame.setLocation(953,20);
        frame.setPreferredSize(new Dimension(970,1000));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        RaceThread t = new RaceThread("Poihali");
        t.start();
        try{
            t.join();
        }
        catch (InterruptedException e){
            System.out.printf("%s has been interrupted", t.getName());
        }

    }

    static class RaceThread extends Thread{

        RaceThread(String name){
            super(name);
        }

        @Override
        public void run() {
            ActionListener listener = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    int max = Arrays.stream(new int[]{x1-15,x2+35,x3-60,x4-60,x5-60})
                            .max().getAsInt();
                    if(max >= 620){
                        timer.stop();
                        int[] find = new int[]{x1-15,x2+35,x3-60,x4-60,x5-60};
                        for(int i=1; i<=5; i++){
                            if(find[i-1] >= 620) winner = "The car number " + i + " has won!!!";
                        }
                        System.out.println(winner);
                    }
                    x1 += (1 + Math.random()*5);
                    x2 += (1 + Math.random()*5);
                    x3 += (1 + Math.random()*5);
                    x4 += (1 + Math.random()*5);
                    x5 += (1 + Math.random()*5);

                    frame.getContentPane().add(new Race(x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,one,two,
                            three,four,five));
                    frame.setVisible(true);
                    frame.pack();
                }
            };

            timer = new Timer(1, listener);
            timer.start();
        }
    }

}

