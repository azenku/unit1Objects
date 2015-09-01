import java.awt.Color;
import javax.swing.JFrame;

public class color
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        Color myColor = new Color(0,23,100);
        myColor = myColor.brighter();
        myColor = myColor.brighter();
        myColor = myColor.brighter();
        myColor = myColor.brighter();
        myColor = myColor.brighter();
        myColor = myColor.brighter();
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
        
