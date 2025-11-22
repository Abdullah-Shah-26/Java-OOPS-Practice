class Pen{
  String color;
  String type;

  public void write()
  {
    System.out.println("Writing something");
  }
  public void printColor()
  {
    System.out.println(this.color);
  }
}

class Student{
  String name;
  int age;

  Student()
  {
    System.out.println("Student Constructor Called");
  }

  public void printInfo()
  {
    System.out.println(this.name);
    System.out.println(this.age);
  }
}

public class Objects {
  public static void main(String[] args) {
  Pen pen1 = new Pen();
  pen1.color = "Blue";
  pen1.type = "Gel";
  pen1.printColor();

  Pen pen2 = new Pen();
  pen2.color = "Red";
  pen2.type = "Ball";
  pen2.printColor();

  Class s1 = new Class();
  s1.name = "Abdullah";
  s1.age = 20;

  s1.printInfo();

  }
}
