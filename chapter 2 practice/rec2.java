import java.awt.Rectangle;

public class rec2
{
    public static void main( String[] args )
    {
        Rectangle ekim = new Rectangle(5,10,20,30);
        System.out.println(ekim);
        ekim.add(0,0);
        System.out.println(ekim);
    }
}