package tainting;
import edu.ucr.cs.riple.taint.ucrtainting.qual.RPolyTainted;

public class TaintStubSample {

  public static void printUntaintedString(String s) {
    System.out.println(s);
  }

  public static @RPolyTainted String compute(@RPolyTainted String s1, @RPolyTainted String s2) {
      return "test";
  }
}
