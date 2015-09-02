import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle2.setPenColor(Color.BLUE);
        turtle3.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle2.penDown();
        turtle3.penDown();
        
        for (int i=1; i<9999; i++){
            turtle.forward(200);
            turtle2.forward(50);
            turtle2.turn(95);
            turtle2.forward(100);
            turtle3.forward(100);
            turtle.backward(10);
            turtle2.backward(60);
            turtle3.backward(130);
            turtle.turn(157);
            turtle2.turn(1000);
            turtle3.turn(1000);
            Thread.sleep(1); // sleep 1000 milliseconds (1 second);
        }
        
        
        }
    }

