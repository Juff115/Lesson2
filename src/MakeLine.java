import TurtleGraphics.*;
import hsa.*;
public class MakeLine {


    public static void main(String[] args) {
        Console c = new Console();
        int x1, x2, y1,y2;
        c.print("Enter x value of first point of the line: ");
        x1 = c.readInt();
        c.print("Enter y value of first point of the line: ");
        y1 = c.readInt();
        c.print("Enter x value of second point of the line: ");
        x2 = c.readInt();
        c.print("Enter y value of second point of the line: ");
        y2 = c.readInt();
        SketchPadWindow s = new SketchPadWindow(400,400);
        //make pen
        Pen p = new RainbowPen(s);
        p.up();
        //sub 200 for actual
        p.move(x1-200,y1-200);
        p.down();
        p.drawString("(" + x1 +", "+ y1 + ")");
        p.move(x2-200, y2-200);
        p.drawString("(" + x2 +", "+ y2 + ")");
    }
    
}
