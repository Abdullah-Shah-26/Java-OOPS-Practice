class PrivateConstructor{
  int a;
  double b; 
  String c;
  private PrivateConstructor()
  {
    a =10;
    b =30.6;
    c ="Abdullah";
    System.out.println(a + " " + b +  " " + c);
  }
  static void Show(){
    
  }

  public static void main(String[] args) {
    PrivateConstructor ref = new PrivateConstructor();
  }
}

