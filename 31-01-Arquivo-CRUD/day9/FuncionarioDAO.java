import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FuncionarioDAO implements IFuncionarioDAO {
  private final String DATABASE = "./DB.TXT";
  private BufferedReader reader = null;
  private BufferedWriter writer = null;
  
  // 1. Criar construtor padrão
  public FuncionarioDAO() {
    openDatabase();
  }
  
  private void openDatabase() {
    reader = FileUtils.getReader(DATABASE);
    	FileUtils.mark(reader, 1024*1024);
    writer = FileUtils.getWriter(DATABASE);
  }
  
private void openDatabase(boolean b) {
		reader = FileUtils.getReader(DATABASE);
			FileUtils.mark(reader, 1024*1024);
		writer = FileUtils.getWriter(DATABASE,b);
	}
  
  private void closeDatabase() {
  FileUtils.close(writer);
  FileUtils.close(reader);
  }
  
  // 2. Implementar todos os métodos de IFuncionarioDAO
  
  public int inserir(Funcionario f) {
    // Gravar em Banco de Dados (Arquivo Texto)
    
    // 1. Criar um looping de leitura
    String line = null;
    while((line = FileUtils.readLine(reader)) != null) {
      String[] parts = line.split(";");
      int id = Integer.parseInt(parts[0]);
      
      // 2. Verificar se o id já não existe
      if(id == f.getId()) {
        // 3. Se existir emitir ERRO e sair
        Utils.sayError("Funcionario ja cadastrado!");
        return 0; // Falha
      }
    }
    
    // 4. Se não existir, inserir
    String record = "" + f.getId() + ";" + f.getNome() + ";" +
                         Utils.toString(f.getAdmissao()) + ";" +
                         f.getSalario();
    FileUtils.writeLine(writer, record);
    return 1; // Sucesso
  }
  
  public int alterar(Funcionario f) {

  	   ArrayList <Funcionario> fun = new ArrayList <>();
       String line = null;
       
      
      Funcionario[] foi = getAll();
    for(int i = 0;i< foi.length;i++){
      if(foi[i].getId() == f.getId()) {  
      	  foi[i].setNome(f.getNome());
      	  foi[i].setAdmissao(f.getAdmissao());
      	  foi[i].setSalario(f.getSalario());
        // 3. Se existir emitir ERRO e sair
      }
    //  fun.add(linhaemfuncionario(parts));
  
    fun.add(foi[i]);
    }
   openDatabase(false);
   for(int i=0;i<fun.size();i++){
   	  
   	   inserir(fun.get(i));
   	  
   }
return 0;
        
   }
        
  

 
 public Funcionario linhaemfuncionario(String line) {
  	   Funcionario f = new Funcionario();
  	   String[] fValues = line.split(";");
  	   f.setId(Integer.parseInt(fValues[0]));
  	   f.setNome(fValues[1]);
  	   f.setAdmissao(Utils.toDate(fValues[2]));
  	   f.setSalario(Double.parseDouble(fValues[3]));
    return f;    
  }
  
  

  	   
  	  public int deletaById(int ids) {
		// 1. Criar looping
		// 2. Localizar por Id
		ArrayList<Funcionario> lista = new ArrayList<>();
		String line =  null;
		
		Funcionario[] f = getAll();
		for(int i = 0; i < f.length; i++){
			if (f[i].getId() == ids){
				continue;
			}
			lista.add(f[i]);
		}
		openDatabase(false);
		for (int i = 0; i < lista.size(); i++){
			inserir(lista.get(i));
		}
		
		return 0;
	}
    
  public int deleteByName(String name) {
  	  ArrayList<Funcionario> lista = new ArrayList<>();
		String line =  null;
		
		Funcionario[] f = getAll();
		for(int i = 0; i < f.length; i++){
			if (f[i].getNome().equalsIgnoreCase(name) == true){
				continue;
			}
			lista.add(f[i]);
		}
		openDatabase(false);
		for (int i = 0; i < lista.size(); i++){
			inserir(lista.get(i));
		}
		
		
  return 0;
  }
  
  public Funcionario getById(int id) {
    return null;
  }
  
  public Funcionario getByName(String name) {
    return null;
  }
  
  public boolean contains(int id){
    	String line = null;
    	FileUtils.reset(reader);
    	while((line = FileUtils.readLine(reader)) != null) {
    		String[] parts = line.split(";");
    		int id2 = Integer.parseInt(parts[0]);
    		//Verificar se o id existe
    		if(id == id2){
    			return true;
    		}
    	}
    	return false;
    }
    public boolean containsName(String nome){
    	String line = null;
    	FileUtils.reset(reader);
    	while((line = FileUtils.readLine(reader)) != null) {
    		String[] parts = line.split(";");
    		String id2 = (parts[1]);
    		//Verificar se o id existe
    		if(nome.equalsIgnoreCase(id2) == true){
    			return true;
    		}
    	}
    	return false;
    }
    
    public Funcionario[] getAll() {
    	ArrayList<Funcionario> listaF = new ArrayList<>();
    	String line = null;
    	FileUtils.reset(reader);
    	while((line = FileUtils.readLine(reader)) != null){
    		
    		String[] parts = line.split(";");
    		int id = Integer.parseInt(parts[0]);
    		String nome = parts[1];
    		Date admissao = Utils.toDate(parts[2]);
    		Double salario = Double.parseDouble(parts[3]);
    		Funcionario f = new Funcionario();
    		
    		f.setId(id);
    		f.setNome(nome);
    		f.setAdmissao(admissao);
    		f.setSalario(salario);
    		
    		listaF.add(f);
    		
    	}
    	return listaF.toArray(new Funcionario[listaF.size()]);
    	
    }

}
