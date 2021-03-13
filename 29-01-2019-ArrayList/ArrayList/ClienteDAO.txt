import java.util.Objects;
import java.util.Date;
// DTO = Data Transfer Object ou VO = Value Object
public class Cliente implements Comparable {
  // Veja isto   -> |---------------------|
  
  // Attributes List/Lista de Atributos
  private int id;
  private String nome;
  private Date datas;
  //private Date aniversario;
  
  // Constructors / Construtores
  public Cliente() { // Default Constructor/Construtor Padrao
  }

  // Construtor sobrecarregado com 2 parâmetros
  public Cliente(int id, String nome,Date data) {
    setId(id);
    setNome(nome);
    setDatas(datas);
  }
  
  // Setters and Getters
  // -------------------
  
  // Setter para o id
  
  public Date getData(){
      return datas;
  }
  public void setDatas(Date datas){
      this.datas = datas;
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
  
  // Método de verificação de igualdade de objetos (opcional)
  @Override 
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (this.getClass() != obj.getClass()) return false;
    if (!(obj instanceof Cliente)) return false;
      Cliente cliente = (Cliente)obj;
    if(cliente.getId() != getId() || !cliente.getNome().equalsIgnoreCase(getNome())) {
      return false;
    }
    return true;
  }
  
  // Método de geração hashCode (opcional)
  @Override 
  public int hashCode() {
    /*
    // Antes da versão 1.7 do Java
    int hash = 7;
    hash = 31 * hash + (int) id;
    hash = 31 * hash + (getId() == 0 ? 0 : getId().hashCode());
    hash = 31 * hash + (getNome() == null ? 0 : getNome().hashCode());
    return hash;
    */
    // Java 1.8 (Java 8) em diante
    return Objects.hash(getId(), getNome());
  }  
  
  // Método que realiza a comparação para a ordenação (alfabético por nome)
  // Este método deve ser implementado quando a classe tiver 'implements Comparable'
  @Override
  public int compareTo(Object obj) {
    if (this == obj) return 0;
    if (obj == null) return 1;
    if(obj instanceof Cliente) {
        Cliente cliente = (Cliente)obj;
        return (getNome().compareTo(cliente.getNome()));
    }
    return -1;
  }
  
  // Método que exibe a representação string de um objeto
  
  @Override
   public String toString() {
      if(getData() != null){
          return "" + getId() + "\t" + getNome() + "\t" + getData();
      }
      else{
          return "" + getId() + "\t" + getNome()+ "\t" + "Data nao cadastrada";
      }
   
  }
  
}

