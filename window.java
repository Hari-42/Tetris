import javax.swing.JFrame;
import java.awt.*;


public class window {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tetris");
        frame.setVisible(true);
    }


}
