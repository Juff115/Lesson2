import TurtleGraphics.*;
import hsa.*;
public class Bargraph {

   
    public static void main(String[] args) {
        Console c = new Console();
       
        int n1, n2, n3, n4;
        //get numbers
        c.print("Enter first number: ");
        n1 = c.readInt();
        c.print("Enter second number: ");
        n2 = c.readInt();
        c.print("Enter third number: ");
        n3 = c.readInt();
        c.print("Enter fourth number: ");
        n4 = c.readInt();
         SketchPadWindow s = new SketchPadWindow(300,250);
        //make pen
        Pen p = new RainbowPen(s);
        p.setWidth(50);
        p.up();
        p.move(30-150, 0-125);
        p.down();
        p.move(30-150, n1-125);
        p.up();
        p.move(100-150, 0-125);
        p.down();
        p.move(100-150, n2-125);
        p.up();
        p.move(170-150, 0-125);
        p.down();
        p.move(170-150, n3-125);
        p.up();
        p.move(240-150, 0-125);
        p.down();
        p.move(240-150, n4-125);
        
    }
    
}
