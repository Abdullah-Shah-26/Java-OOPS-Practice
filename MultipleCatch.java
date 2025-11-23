public class MultipleCatch {
  public static void main(String[] args) {
    try{
      int a=10,b=2,c;
      c = a/b;
      System.out.println(c);

      int arr[] = {10,20,30};
      System.out.println(arr[0]);

      
      String str = "ankit";
      System.out.println(str.toUpperCase());

    }catch(ArrayIndexOutOfBoundsException a)
    {
      System.out.println("Array out of Bounds");
    }catch(ArithmeticException e)
    {
      System.out.println("Arithmetc Exception");
    }
    catch(NumberFormatException n)
    {
      System.out.println("Array Exception");
    }
    catch(Exception x)
    {
      System.out.println("All type Exception handled");
    }
  }
}
