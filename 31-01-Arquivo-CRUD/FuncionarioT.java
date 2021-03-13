import java.util.Date;


public class FuncionarioT{

  
   private String nome;

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
}