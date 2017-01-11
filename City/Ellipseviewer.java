
import javax.swing.JFrame;
/**
 * Write a description of class Ellipseviewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ellipseviewer
{
    public static void main (String[] args){
        
      JFrame frame = new JFrame();

      frame.setSize(500,500);
      frame.setTitle("Circle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      EllipseComponent Component = new EllipseComponent();
      frame.add(Component);
      frame.setVisible(true);
        
        
        
        
        
    }
}


