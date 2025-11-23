public class NestedCatch {
  public static void main(String[] args) {
    
    try{
      System.out.println(10/2);
    }
    catch(Exception e)
    {
      System.out.println(e);  m
      try{
        String a = null;
        System.out.println(a.toLowerCase());
      }
      catch(NullPointerException n)
      {
        System.out.println("Null value cannot be converted");
      }
    }
    
  }
}
