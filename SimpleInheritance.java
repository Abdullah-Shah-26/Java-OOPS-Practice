// Class
class Student{
  protected 
  int rollno;
  int marks;
  String name;
  void input()
  {
    System.out.println("Enter rollno, name, marks : ");
  }
}
// Subclass
class ankit extends Student{
  void disp()
  {
    rollno = 1;
    name = "ankit";
    marks = 99;
    System.out.println(rollno + " " + name + " " + marks);
  }
}

public class SimpleInheritance {
  public static void main(String[] args) {
    ankit r = new ankit();
    r.input();
    r.disp();
  }  
}
