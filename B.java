class A extends Thread{
  public void run()
  {
    try{
       for(int i = 1;i <= 5; i++)
    {
      System.out.println("Abc");
      Thread.sleep(1000);
    }
    }
    catch(Exception e)
    {
      System.out.println("Exception Handled");
    }
  }
}

public class B {567890-987654367890-=098765432wq4567890-09876543ewq2e4r567890-0987654325678
  public static void main(String[] args) throws InterruptedException {
    A t = new A();
    t.start();

    for(int i = 1;i <= 5; i++)
    {
      System.out.println("Xyz");
      Thread.sleep(1000);
    }
  }
}
