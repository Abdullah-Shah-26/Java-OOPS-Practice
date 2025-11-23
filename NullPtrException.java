public class NullPtrException {
  public static void main(String[] args) {
    String str = null;
    try{
    System.out.println(str.toUpperCase());  
    }
    catch(NullPointerException n){
    System.out.println("NULL cannot be casted");  
    }
  }  
}
