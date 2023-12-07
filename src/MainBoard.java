import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MainBoard {
    private int x;
    private int y;
    private int size;
    int num_of_squares = 5;

    public MainBoard(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLACK);
        g2.draw(new Rectangle2D.Double(x, y, size, size));
    }

    public MainBoard[] divide() {
        MainBoard[] squares = new MainBoard[25];
        int newSize = size / num_of_squares;
        int index = 0;

        for (int i = 0; i < num_of_squares; i++) {
            for (int j = 0; j < num_of_squares; j++) {
                squares[index] = new MainBoard(x + i * newSize, y + j * newSize, newSize);
                index++;
            }
        }

        return squares;
    }
}