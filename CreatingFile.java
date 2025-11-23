import java.io.*;

public class CreatingFile {
  public static void main(String[] args) throws IOException {
    File f = new File("C:\\Users\\Abdullah\\Java\\LC.txt");
    // try{
         if(f.createNewFile())
        {
          System.out.println("File Successfully Created....");
        }
         else
      { 
      System.out.println("File Already Exist....");
      }
    // }
    // catch(IOException i)
    // {
    //   System.out.println("Exception Handled....");
    // }
  }
}
