package figures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Rocket extends JPanel {
    private BufferedImage img;
    private final int x;
    private final int y;

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
