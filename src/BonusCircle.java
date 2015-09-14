import TurtleGraphics.*;

public class BonusCircle {

    
    public static void main(String[] args) {
        SketchPadWindow win = new SketchPadWindow(600,400);
        Pen p = new WiggleRainbowPen(win);
        p.setWidth(10);
        p.up();
        p.turn(-90);
        p.move(160);
        p.down();
        p.turn(90);
        for (int i = 1; i<=100; i++){           
        //turn pen 3.6 and move 1 
            p.turn(3.6);
            p.move(10);
        }
    }
    
}
