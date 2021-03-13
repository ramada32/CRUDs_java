import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.EOFException;

public class RAFTest2 {

  public static void main(String[] args) {
    String fileName = "./test.raf";
    RandomAccessFile raf = null;
    try {
      raf = new RandomAccessFile(fileName, "rw");
      while(true){
        try{
          int number = raf.readInt();
          System.out.println(number);
        } catch(EOFException e){
          break;
        }
      }    
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        raf.close();
      } catch (IOException e) {
      }
    }
    
    System.out.println("Bye");
  }

}
