interface A{
  void show();// pubic + abstract 
}
interface B{
  void disp(); // public + abstract method
}
class Multiple implements A,B {
  public void show() // write public else it will be defualt 
  {
    System.out.println("InterFace A");
  }
  public void disp()
  {
    System.out.println("Interface B");
  }
}

public class MultipleInheritanceInterface {
  public static void main(String[] args) {
    Multiple m = new Multiple();
    m.show();
    m.disp();
  }
}
