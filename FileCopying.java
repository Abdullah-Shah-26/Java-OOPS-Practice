import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopying {
  public static void main(String[] args) throws IOException {
    FileInputStream r = new FileInputStream("C:\\Users\\Abdullah\\Java\\Renamed.txt");  
    FileOutputStream w = new FileOutputStream("C:\\Users\\Abdullah\\Java\\Copied.txt");

    int i;
    while((i = r.read())!= -1)
    {
      w.write((char)i);
    }
    System.out.println("Data Copied Successfully");
  }
} 
