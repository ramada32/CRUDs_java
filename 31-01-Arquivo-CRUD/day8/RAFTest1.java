import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFTest1 {
  
  public static void main(String[] args) {
    String fileName = "./test.raf";
    RandomAccessFile raf = null;
    try {
      raf = new RandomAccessFile(fileName, "rw");
      for(int i=0; i < 10; i++) {
        int number = Utils.getRandomNumber(100, 250);
        raf.writeInt(number);
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
