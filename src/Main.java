import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.stream.Location;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main extends JFrame {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame();
        frame.setLocation(1120,240);
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Rocket aa = new Rocket(100,100);

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
