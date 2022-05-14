import java.util.*; //implicit importing 
// import java.util.HashSet; //explict importing

public class set
{
  public static void main (String[]args)
  {
    // Input order is not preserverd
    // Duplicates not allowed.
    // HashSet<Integer> hs = new HashSet < Integer > ();
    Set<Integer> hs = new HashSet<Integer>();
    
    hs.add (5);
    hs.add(10);
    hs.add(11);
    hs.add(-1);
    
    hs.add(5); //silent discarding of 5 
    System.out.println (hs);
  }
}
