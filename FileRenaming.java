import java.io.*;

public class FileRenaming {
  public static void main(String[] args)  {
    File f = new File("C:\\Users\\Abdullah\\Java\\LC.txt");
    File r = new File("C:\\Users\\Abdullah\\Java\\Renamed.txt");
  
    if(f.exists())
    {
      System.out.println(f.renameTo(r));
    }
    else{
      System.out.println("File doensn't exist....!");
    }
  }
}
