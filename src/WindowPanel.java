import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WindowPanel extends JPanel {
    private MainBoard mainSquare;
    private BufferedImage backgroundImage;

    public WindowPanel(MainBoard mainSquare) {
        this.mainSquare = mainSquare;

        // Wczytaj tło z pliku (zmień ścieżkę do odpowiedniego pliku)
        try {
            backgroundImage = ImageIO.read(new File("images/background.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Rysowanie tła
        if (backgroundImage != null) {
            g2.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        g2.setStroke(new BasicStroke(3.0f));

        mainSquare.draw(g2);
        MainBoard[] smallerSquares = mainSquare.divide();
        for (MainBoard square : smallerSquares) {
            square.draw(g2);
        }

    }
}
