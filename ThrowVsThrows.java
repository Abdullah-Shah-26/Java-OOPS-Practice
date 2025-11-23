public class ThrowVsThrows {
  void div(int a, int b) throws ArithmeticException
  {
    if(b == 0)
    {
      throw new ArithmeticException();
    }
    else{
      int c = a/b;
      System.out.println(c);
    }
  }
  public static void main(String[] args) throws ArithmeticException {
    ThrowVsThrows t = new ThrowVsThrows();
       t.div(20,0);

    // try{
    //    t.div(20,0);
    // }
    // catch(Exception e)
    // {
    //   System.out.println("Cannot divide by 0 ");
    // }
  }
}
