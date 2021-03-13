import java.util.Date;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Funcionario {
  // Lista de atributos
  private int id;
  private String nome;
  private Date admissao;
  private double salario;
  
  
  public Funcionario(){
  	  
  }
 
  
  // 2. Implementar Setters e Getters para todos os atributos
  public void setSalario(double salario){
   	this.salario = salario;   
   }
     public double getSalario(){
  	  return salario;
  }
  public void  setAdmissao(Date admissao){
  	  this.admissao = admissao;
  }
  public Date getAdmissao(){
  	  return admissao;
  }
  public void setId(int id) {
    if(id < 1) {
      System.out.println("Id deve ser maior que zero");
      System.exit(-1);
    }
    this.id = id;    
  }
  
  // Getter para o id
  public int getId() {
    return id;
  }

  // Setter para nome
  public void setNome(String nome) {
    if(nome == null) {
      System.out.println("Nome nao pode ser NULL");
      System.exit(-1);
    }
    this.nome = nome;
  }
  
  // Getter para nome
  public String getNome() {
    return nome;
  } 
   
  
  
  // 3. Implementar método toString()
  
  public String toString(){
  	  StringBuilder sb = new StringBuilder();
  	  sb.append(getId()).append("\t").append(getNome()).append("\t");
  	  sb.append("\t").append(Utils.toString(getAdmissao()));
  	  return sb.toString();
  }
  public int Lista(){
  		String filename = "./DB.txt";
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
  // 1. Implementar apenas o construtor padrão
  
  // 2. Implementar Setters e Getters para todos os atributos
  
  // 3. Implementar método toString()
  
}
