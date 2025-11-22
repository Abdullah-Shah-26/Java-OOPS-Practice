public class StaticBlock {
    public static void main(String[] args) {
      StaticBlock s = new StaticBlock();
    }
    StaticBlock()
    {
      System.out.println("Constructor");
    }
    {
      System.out.println("Instance Block before Constructor");
    }
     static {
        System.out.println("Static Block Called before JVM");
    }
}

 

