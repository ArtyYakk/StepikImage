import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main extends JFrame {
    static int xx = -174;
    static int yy = -174;

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Ракета");
        frame.setLocation(1120,240);
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Rocket aa = new Rocket(xx,yy);

        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DateFormat dateFormat =  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();

                if(xx <= 780){
                    xx += 2;
                    yy += 2;
                }
                else{
                    xx = -174;
                    yy = -174;
                }
                System.out.println(xx + " " + yy);
                frame.add(new Rocket(xx,yy));
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
