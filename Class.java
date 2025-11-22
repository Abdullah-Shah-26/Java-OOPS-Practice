class StudentDetails {
  int rno;
  String name;
  float marks;

  StudentDetails(int rno, String name, float marks) {
    this.rno = rno;
    this.name = name;
    this.marks = marks;
  }
}

public class Class {
  public static void main(String[] args) {
    StudentDetails s1 = new StudentDetails(1, "Abdullah", 100);
    System.out.println(s1.rno);
    System.out.println(s1.name);
    System.out.println(s1.marks);
  }
}