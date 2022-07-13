package figures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Dvd extends JPanel {
    public BufferedImage img;
    private final int x;
    private final int y;

    public Dvd(int x, int y){
        this.x = x;
        this.y = y;
        try{
            img = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\dvd.png"));
        } catch (IOException ex){
            System.out.println("Picture hasn't found");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, x,y,this);
    }
}
