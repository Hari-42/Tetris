import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class window extends JFrame {

    public window() {
        setTitle("Tetris");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 800);

        GamePanel panel = new GamePanel();
        panel.setBackground(Color.BLACK);
        setContentPane(panel);

        setLocationRelativeTo(null); // Center window on screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new window();
    }
}

class GamePanel extends JPanel {

    private int score = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int rectWidth = 360;
        int rectHeight = 600;

        int x = (getWidth() - rectWidth) / 2;
        int y = (getHeight() - rectHeight) / 2;

        g.setFont(new Font("Arial", Font.BOLD, 32));
        g.setColor(Color.WHITE);

        String title = "TETRIS";
        int titleWidth = g.getFontMetrics().stringWidth(title);
        g.drawString(title, (getWidth() - titleWidth) / 2, y - 20);

        g.drawRect(x, y, rectWidth, rectHeight);

        String scoreText = "Score: " + score;
        g.drawString(scoreText, x + rectWidth + 40, y + 32);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1280, 800);
    }
}
