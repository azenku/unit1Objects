import java.util.Random;


public class die
  {
      public static void main( String[] args )
      {
          Random gen = new Random();
          int die = gen.nextInt(6); //returns 0-5
          die += 1;
          
          System.out.println( die );
          
          
          // option b
          
          double die2 = Math.random(); //returns a double betwen 0-1
          die2*= 6;    //range 0-6
          die2 += 1;    // range1-7
          System.out.println( (int) die2 );   //print
        }
    }