import javax.swing.*;

public class Window extends JFrame {

    int frame_width = 640;
    int frame_height = 512;
    int rect_size = 300;
    int rect_x = (frame_width - rect_size) / 2;
    int rect_y = (frame_height - rect_size) / 2;
    public Window() {
        MainBoard mainSquare = new MainBoard(rect_x, rect_y, rect_size);
        WindowPanel squarePanel = new WindowPanel(mainSquare);

        add(squarePanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(frame_width, frame_height);
        setLocationRelativeTo(null);
        setTitle("Plancity");
    }
}