import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World(1000,1000);
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        double die2 = Math.random(); //returns a double betwen 0-1
          die2*= 6;    //range 0-6
          die2 += 1;    // range1-7
        turtle.setPenColor(Color.RED);
        turtle2.setPenColor(Color.BLUE);
        turtle3.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle2.penDown();
        turtle3.penDown();
        turtle.turn(90);
        turtle.forward(500);
        for (int i=1; i<9999; i++){
            turtle.forward(46);
            turtle2.forward(50);
            turtle2.turn(95);
            turtle2.forward(103);
            turtle3.forward(76);
            turtle.turn(23);
            turtle3.turn(45);
            turtle.backward(190);
            turtle2.backward(60);
            turtle3.backward(137);
            turtle.turn(17);
            turtle.forward(50);
            turtle2.turn(1000);
            turtle3.turn(74);
            Thread.sleep(1); // sleep 1000 milliseconds (1 second);
        }
        
        
        }
    }

