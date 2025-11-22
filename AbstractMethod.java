abstract class Programming{
  abstract public void Developer();
  abstract public void Rank();
}

abstract class HTML extends Programming{
  @Override
  public void Developer()
  {
    System.out.println("Tim Berners Lee");
  }
  // @Override
  // public void Rank()
  // {
  //   System.out.println("3rd");
  // }
}

class Java extends HTML{
  // @Override
  // public void Developer()
  // {
  //   System.out.println("James Gosling");
  // }
  @Override
  public void Rank()
  {
    System.out.println("1st");
  }
}

public class AbstractMethod {
  public static void main(String[] args) {
    Programming j = new Java();
    j.Developer();
    j.Rank();
  }
}
