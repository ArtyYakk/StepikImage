import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.xml.stream.Location;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main extends JFrame {
    static int xx = 0;
    static int yy = 0;

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setLocation(1120,240);
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Rocket aa = new Rocket(xx,yy);
        frame.addMouseListener(new MouseInputAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(xx <= 780){
                    xx += 20;
                    yy += 20;
                }
                else{
                    xx = -173;
                    yy = -173;
                }
                System.out.println(xx + " " + yy);
                frame.add(new Rocket(xx,yy));
                frame.setVisible(true);
                frame.pack();
            }
        });

        frame.add(aa);
        frame.setVisible(true);
        frame.pack();
    }

    public static class Rocket extends JPanel{
        private BufferedImage img;
        private int x;
        private int y;

        public Rocket(int x, int y){
            this.x = x;
            this.y = y;
            try{
                img = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\0.png"));
            } catch (IOException ex){
                System.out.println("Picture hasn't found");
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img.getScaledInstance(img.getWidth()/2,
                    img.getHeight()/2,Image.SCALE_DEFAULT), x,y,this);
        }
    }

}
