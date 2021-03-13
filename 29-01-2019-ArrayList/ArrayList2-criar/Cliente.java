import java.util.Date;
 
 
public class Cliente{
 
 
  
     
    private int id;
    private String Nome;
    private Date data;
    
    public Cliente(){
    	
    }
     
     public Cliente(int id,String Nome,Date data){
     
     	 setId(id);
     	 setNome(Nome);
     	 setData(data);

     }
     
     
     public String getNome(){
     	 return Nome;	 
     }
     
     public Date getData(){
     	return data;	 
     	 
     }
     public int getId(){
     	return id;	 
     	 
     }
     public void setData(Date data){
     	this.data = data;	 
     	 
     }
     public void setNome(String Nome){
     	this.Nome = Nome;	 
     }
     public void setId(int id){
     	this.id = id;	 
     }
     
     
      @Override
  public String toString() {
  	  if(getData() != null){
    return "" + getId() + "\t" + getNome() + "\t" + Util.toString(getData()) ;
      }
      else{
      	  return "" + getId() + "\t" + getNome() + "\t" + "DATA DE NASCIMENTO NAO CADASTRADA" ;
      }
  }
  }
