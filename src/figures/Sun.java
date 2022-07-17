package figures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Sun extends JPanel {
    public BufferedImage sun;
    public BufferedImage earth;
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Sun(int x1, int y1,int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        try{
            sun = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\sun.png"));
            earth = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\earth.png"));

        } catch (IOException ex){
            System.out.println("Picture hasn't found");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sun.getScaledInstance(sun.getWidth()/4, sun.getHeight()/4,
                Image.SCALE_DEFAULT), x1, y1, this);
        g.drawImage(earth.getScaledInstance(earth.getWidth()/6, earth.getHeight()/6,
                Image.SCALE_DEFAULT), x2, y2, this);
    }
}
