class shape{
  void draw()
  {
    System.out.println("Cannot say shape type");
  }
};
class square extends shape
{
  @Override
  void draw()
  {
    super.draw();
    System.out.println("Square");
  }
}
class MethodOverriding
{
  public static void main(String[] args) {
    shape r = new square();
    r.draw();    
  } 
}
  