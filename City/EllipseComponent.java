

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;

public class EllipseComponent extends JComponent
{
    int x, y, w, h;
     public void paintComponent(Graphics g){
    // recovers Graphics2D
    Graphics2D g2 = (Graphics2D) g;
    
    // draw circle
    Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 100);
    g2.draw(head);
}

// Sets X variable
public void setX(int x){
    
    this.x = x;
}

// Sets Y variable
public void setY(int y){
    
    this.y = y;
}

// Sets W variable
public void setW(int w){
    
    this.w = w;
}

// Sets H variable
public void setH(int h){
    
    this.h = h;
}

// Gets X variable
public int getX(){
    return x;
}

// Gets Y variable
public int getY(){
    return y;
}

// Gets W variable
public int getW(){
    return w;
}

// Gets H variable
public int getH(){
    return h;
}
}