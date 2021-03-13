import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFileTest1 {
  
  public static void main(String[] args) {
    String filename = "./tmp.txt";
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(filename));
      for(int i=0; i < 10; i++) {
        String line = "Linha " + (i+1);
        writer.write(line);
        writer.newLine();
        writer.flush();
      }
    } catch(Exception ex) {
      ex.printStackTrace();
    } finally {
      if(writer != null) {
        try {
          writer.close();
        } catch(Exception ex) {
        }
      }
      writer = null; // Boa prática
    }
    
    System.out.println("Bye");
  }
  
}
