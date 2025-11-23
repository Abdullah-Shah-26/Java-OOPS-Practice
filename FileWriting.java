import java.io.*;

public class FileWriting {
  public static void main(String[] args) {
    try{
      FileWriter f = new FileWriter("C:\\Users\\Abdullah\\Java\\LC.txt");
      try{
        f.write("Java Programming is Verbose");
      }
      finally
      {
        f.close();
      }
      System.out.println("Successfully Data Written in File");
    }catch(IOException i)
    {
      System.out.println(i);
    }
  }
}
