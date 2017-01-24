
import java.awt.*;
import javax.swing.JComponent;
/**
 * Write a description of class Buildings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int Xposition;
    private int Yposition;
    private int xLength;
    private int yLength;
    private Color color;
    

    /**
     * Default constructor for objects of class Buildings
     */
    public Building(int positionX, int positionY,int length, int width, Color shade)
    {
        Xposition = positionX;
        Yposition = positionY;
        xLength = length;
        yLength = width;
        color = shade;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw (Graphics page){
        // draws the building
   

     page.setColor (color);

      // head
     page.drawRect(Xposition, Yposition, xLength,yLength);
     //       two numbers above are length, width
     for (int i = 0; i <= 4; i++){// loop to make windows
         page.drawRect(Xposition + i * 10,Yposition,5,7);
         for (int j = 0; j <= 29; j++){
             page.drawRect(Xposition + i*10, Yposition + j * 10, 5, 7);
            }
    }
    }
}
