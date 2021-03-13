import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;




public class Funcionario{

   private final String DATABASE = "./DB.TXT";
  // grava
   //le arquivo
   
  // 1 - criar construir padrao
 
  private void openDatabase(){
  
  }
  
  private void closeDatabase(){
  	  
  }
  
 

  	  public int insere(String f){
	 	 
	String filename = "./Felipe.txt";
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(filename,true));

        FuncionarioT ft = new FuncionarioT();
       // String line = ft.getNome();
        writer.write(f);
        writer.newLine();
        writer.flush();
      
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
	 	 return 0;
	 }//gravar em banco de dados arquivo texto
	 
	 
  	public int Lista(){
  		String filename = "./DB.TXT";
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
    return 0;
    
  }
  		
  	
  }
  
