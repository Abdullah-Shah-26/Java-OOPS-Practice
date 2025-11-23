
public class ExceptionHandling {
  public static void main(String[] args) {
  System.out.println("Main Method Started");    
  int a= 10, b= 0, c;
  try{
    c = a/b;
    System.out.println(c);
  }
  catch(ArithmeticException e)
  {
    System.out.println("Cannot divide by 0");
  }
  System.out.println("Main Method Ended");
  }
}
