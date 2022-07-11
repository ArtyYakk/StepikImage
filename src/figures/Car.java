package figures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Car extends JPanel {
    public BufferedImage img;
    private final int x;
    private final int y;
    private final double angle;

    public Car(int x, int y, double angle){
        this.angle = angle;
        this.x = x;
        this.y = y;
        try{
            img = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\car.png"));
        } catch (IOException ex){
            System.out.println("Picture hasn't found");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //g.drawImage(img.getScaledInstance(img.getWidth()/2,
        //      img.getHeight()/2,Image.SCALE_DEFAULT), x,y,this);
        Graphics2D g2 = (Graphics2D)g;
        g2.translate(x,y);
        g2.rotate(angle);
        g2.translate(-x,-y);
        g2.drawImage(img.getScaledInstance(img.getWidth()/2,img.getHeight()/2,
                Image.SCALE_DEFAULT),x,y,this);
    }
}
