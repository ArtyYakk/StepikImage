package figures;

import javax.swing.*;
import java.awt.*;

public class RaceWinnerBanner extends JPanel{
    String text;

    public RaceWinnerBanner(String text) {
        this.text = text;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g.setFont(new Font(null,Font.ITALIC,50));
        g.drawString(text,150,400);
    }
}
