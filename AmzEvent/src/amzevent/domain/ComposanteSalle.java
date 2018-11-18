
package amzevent.domain;
import java.awt.Color;
import java.awt.Point;
import java.util.LinkedList;
import java.util.List;

public abstract class ComposanteSalle {
    
     private Point point;
     private List<Point> position;
     public ComposanteSalle(Point point)
     {
         this.point = point;
     }
     public ComposanteSalle()
     {
         
     }
 
     public Point getPoint() 
     {
         return point;
     }
      public void setPoint(Point point) 
     {
         this.point = point;
     }
 }