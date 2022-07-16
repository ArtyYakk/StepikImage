package figures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Dvd extends JPanel {
    public BufferedImage newImg;
    private final int x;
    private final int y;

    public Dvd(int x, int y, int r, int g, int b){
        this.x = x;
        this.y = y;
        try{
            BufferedImage img = ImageIO.read(new File("C:\\Users\\iakon\\Pictures\\dvd.png"));
            newImg = new BufferedImage(img.getWidth(),img.getHeight(), BufferedImage.TYPE_INT_ARGB);

            for(int i = 0; i<img.getWidth(); i++){
                for (int j = 0; j<img.getHeight(); j++){
                    if(img.getRGB(i,j) != 0){
                        newImg.setRGB(i,j,new Color(r,g,b).getRGB());
                    }
                }
            }
        } catch (IOException ex){
            System.out.println("Picture hasn't found");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(newImg, x,y,this);
    }
}
