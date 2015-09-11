import hsa.*;

public class PizzaCost {

    
    public static void main(String[] args) {
        Console c = new Console();
        double size, topnum, base, top, basein, total;
        base = 2.25;
        top = 0.75;
        basein = 0.5;
        total= 0;
        c.print("What size of pizza do you want in inches?: ");
        size = c.readDouble();
        c.print("How many toppings do you want?: ");
        topnum = c.readDouble();
        total= base + (top * topnum) + (size * basein);
        c.print("Your total cost for the pizza is: $" + total);
    }
    
}
