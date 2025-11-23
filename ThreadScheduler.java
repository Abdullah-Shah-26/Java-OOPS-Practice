class A extends Thread
{
  public void run()
  {
    String n = Thread.currentThread().getName();
   try{
      for(int i = 1; i<= 3; i++)
    {
      System.out.println(n);
      Thread.sleep(500);
    }
   }
   catch(Exception e)
   {
    System.out.println("Exception Handled");
   }
  }
}
public class ThreadScheduler {
  public static void main(String[] args)throws Exception{
  A t1 = new A();
  A t2 = new A();
  A t3 = new A();
  
  t1.setName("thread 1");
  t2.setName("thread 2");
  t3.setName("thread 3");

  // t1.start();
  // t2.start();
  // t3.start();

    // String n = Thread.currentThread().getName();
    // for(int i = 1; i<= 3; i++)
    // {
    //   System.out.println(n);
    // }
    t2.start();
    try{
     t2.join(); 
    }catch(InterruptedException i)
    {
      System.out.println("Exception Handled...");
    }
    t1.start();
    t3.start();
    String name = Thread.currentThread().getName();
    for(int i = 1; i<= 3; i++)
    {
      System.out.println(name);
    }
  }
}
