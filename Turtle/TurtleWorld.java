import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        
        for (int i=1; i<9999; i++){
            turtle.forward(2);
            turtle.backward(1);
            turtle.turn(3);
            Thread.sleep(2); // sleep 1000 milliseconds (1 second);
        }
        
        for (int i=1; i<9999; i++){
            turtle.setPenColor(Color.BLUE);
            turtle.forward(5);
            Thread.sleep(5);
            turtle.turn(3);
            turtle.backward(12);
            Thread.sleep(5);
        }
    }
}
