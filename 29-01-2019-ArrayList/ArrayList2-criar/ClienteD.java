import java.util.ArrayList;


public class ClienteD implements IClienteDAO {

	
 private  ArrayList clientes = new ArrayList();
 
public  int insere(Cliente cliente){
	clientes.add(cliente);
    return 0;
}

public int deleta(){
	
	return 1;
}

public  int altera(){
	
	return 1;
}

	  public Cliente[] list() {
	  	  Cliente [] tmp = new Cliente[clientes.size()];
	  	  for(int i = 0;i<clientes.size();i++){
	  	  	  tmp[i] = (Cliente)clientes.get(i);
	      }
          return tmp;
      }
      
  
     




}