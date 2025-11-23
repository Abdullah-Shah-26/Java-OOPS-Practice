import java.io.*;

public class FileReading {
  public static void main(String[] args) throws IOException {
    // try{
      FileReader r = new FileReader("C:\\Users\\Abdullah\\Java\\LC.txt");
      // try{
        int i;
        while((i = r.read()) != -1)
        {
          System.out.print((char)i);
        }
      // }
      // finally{
      //   r.close();
      // } 
    // }
    // catch(IOException e){
    //   System.out.println("Exception Handled...");
    // }
  }
}
