import java.io.*;

public class FileInfo {
  public static void main(String[] args) {
    File f= new File("C:\\Users\\Abdullah\\Java\\LC.txt");
    if(f.exists())
      {
        System.out.println("File Name : "+ f.getName());
        System.out.println("File Name :"+ f.getAbsolutePath());
        System.out.println("File Location :"+f.canWrite());
        System.out.println("File Readable :"+f.canRead());
        System.out.println("File Size :"+f.length());
        System.out.println("File Removed : "+f.delete());
      }   
      else
      {
        System.out.println("File doesn't exist");
      }  
  }
}
