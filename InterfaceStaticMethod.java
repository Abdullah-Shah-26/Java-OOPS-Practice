interface A
{
  public static void Show()
  {
    System.out.println("Cannot Override Interface static method");
  }
}

class InterfaceStaticMethod{
  public static void main(String[] args) {
    A.Show();   
  }
}