import java.io.BufferedWriter;
import java.io.FileWriter;

public class FuncionarioDAO implements IFuncionarioDAO {
	

   private final String DATABASE = "./DB.TXT";
   //private BufferedWriter writer = null;// grava
   //private BufferedReader reader = null;//le arquivo

	@Override
	 public int insere(Funcionario f){
	 	 
	String filename = "./tmp.txt";
    BufferedWriter writer = null;
    try {
      writer = new BufferedWriter(new FileWriter(filename));

 
        String line = f.getNome() +"/t"+f.getId();
        writer.write(line);
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
	 }
	 @Override
  public int altera(Funcionario f){
   return 0;
  }
  @Override
  public int deletaById(int id){
  	  return 1;
  }
  @Override
  public int deleteByName(String name){
  	  return name;
  	  
  }
  @Override
  public Funcionario getById(int id){
  	   return 0;
  }
  @Override
  public Funcionario getByName(String name){
  	  return Funcionario;
  }
@Override
  public Funcionario[] getAll(){
  	       return Funcionario;
	      }
	 
  }
  
  

	 
  
  // 1. Criar construtor padrão
  
  // 2. Implementar todos os métodos de IFuncionarioDAO
  

