abstract class animal{
  animal()
  {
    System.out.println("All animals....");
  }

  public abstract void sound();
}
class Dog extends animal{
  Dog()
  {
    super();
  }
  public void sound()
  {
    System.out.println("Dog Bark's");
  }
}
class Lion extends animal{
  Lion()
  {
    super(); // calls abstract class's constructor
  }
  public void sound()
  {
    System.out.println("Lion Roar's");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    Dog d = new Dog();
    Lion l = new Lion();
    d.sound();
    l.sound();
  }  
}
