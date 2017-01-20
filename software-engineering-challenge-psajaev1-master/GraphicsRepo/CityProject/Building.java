
import java.awt.*;
/**
 * Write a description of class Buildings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int length;
    private int width;
    private Color color;
    private int position;

    /**
     * Default constructor for objects of class Buildings
     */
    public Building(int baseX, int baseY, Color shade, int point)
    {
        length = baseX;
        width = baseY;
        color = shade;
        position = point;
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
    
   

      page.setColor (color);

      // head
      page.drawLine(length-10, width, 20,20);
      /*
      // trunk
      page.drawLine(baseX, top+20, baseX, baseY-30);

      page.drawLine (baseX, baseY-30, baseX-15, baseY);  // legs
      page.drawLine (baseX, baseY-30, baseX+15, baseY);

      page.drawLine (baseX, baseY-70, baseX-25, baseY-70);  // arms
      page.drawLine (baseX, baseY-70, baseX+20, baseY-85);
      */
    }
}
