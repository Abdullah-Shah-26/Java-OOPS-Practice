interface Client{
  // Public + abstarct methods
  void webdesign();
  void webdevelop();
}
abstract class RajTech implements Client{
  @Override
  public void webdesign()
  {
    System.out.println("Green, top menu, three dot button");
  }
}
class RahulTech extends RajTech{
  @Override
  public void webdevelop()
  {
    System.out.println("HTML, CSS, JAVASCRIPT");
  }
}
public class InterFaceMethod {
  public static void main(String[] args) {
    RahulTech r = new RahulTech();
    r.webdesign();
    r.webdevelop();
  }
}