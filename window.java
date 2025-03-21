import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;


public class window extends JFrame {


    public window() {
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tetris");
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int rectWidth = 360;
        int rectHeight = 600;

        int x = (getWidth() - rectWidth) / 2;
        int y = (getHeight() - rectHeight) / 2;

        g.setColor(Color.WHITE);
        g.drawRect(x, y, rectWidth, rectHeight);
    }

    public static void main(String[] args) {
        new window();
    }
}
