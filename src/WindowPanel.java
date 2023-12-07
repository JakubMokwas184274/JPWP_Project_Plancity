import javax.swing.*;
import java.awt.*;

public class WindowPanel extends JPanel {
    private MainBoard board;

    public WindowPanel(MainBoard mainSquare) {
        this.board = mainSquare;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        board.draw(g2);

        MainBoard[] smallerSquares = board.divide();
        for (MainBoard square : smallerSquares) {
            square.draw(g2);
        }

    }
}