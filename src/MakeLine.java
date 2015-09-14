import TurtleGraphics.*;

public class MakeLine {


    public static void main(String[] args) {
        SketchPadWindow s = new SketchPadWindow(400,400);
        //make pen
        Pen p = new RainbowPen(s);
        p.up();
        //sub 200 for actual
        p.move(100-200,50-200);
        p.down();
        p.drawString("(" + 100 +", "+ 50 + ")");
        p.move(300-200, 300-200);
        p.drawString("(" + 300 +", "+ 300 + ")");
    }
    
}
