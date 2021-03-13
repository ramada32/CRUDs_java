import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFileTest1 {
  
  public static void main(String[] args) {
    String filename = "./tmp.txt";
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(filename));
      String line = null;
      while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
    } catch(Exception ex) {
      ex.printStackTrace();
    } finally {
      if(reader != null) {
        try {
          reader.close();
        } catch(Exception ex) {
        }
      }
      reader = null; 
    }
    
    System.out.println("Bye");
  }
  
}
