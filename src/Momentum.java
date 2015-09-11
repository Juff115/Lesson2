import hsa.*;

public class Momentum {

    public static void main(String[] args) {
        Console c = new Console();
        double mass, velo, mome;
        c.print("Enter object's mass: ");
        mass = c.readDouble();
        c.print("Enter object's velocity: ");
        velo = c.readDouble();
        //calculate
        mome = mass * velo;
        //show results
        c.print("The momentum is " + mome);
        
    }
    
}
