import java.util.Arrays;

public class ClienteDAO implements IClienteDAO {
  private Cliente[] clientes = new Cliente[0]; 
  
  @Override
  public int insere(Cliente cliente) {
    Cliente[] tmp = new Cliente[clientes.length+1];
    System.arraycopy(clientes, 0, tmp, 0, clientes.length);
    tmp[tmp.length-1] = cliente;
    clientes = tmp;
    Arrays.sort(clientes);
    return 1;
  }
  
  @Override
  public int altera(Cliente cliente) {
    int index = -1;
    for(int i=0; i < clientes.length; i++) {
      if(cliente.getId() == clientes[i].getId()) {
        index = i;
        break;
      }
    }
    if(index > -1) {
      clientes[index] = cliente;
      Arrays.sort(clientes);
      return 1;
    }
    return 0;
  }
  
  @Override
  public int deleta(int id) {
    Cliente[] tmp = new Cliente[clientes.length-1];
    int j = 0;
    for(int i=0; i < clientes.length; i++) {
      if(clientes[i].getId() == id) {
        continue; // Ignora o registro com este id
      }
      tmp[j] = clientes[i];
      j++;
    }
    clientes = tmp;
    Arrays.sort(clientes);
    return 1;
  }
  
  @Override
  public int indexOf(int id) {
    for(int i=0; i < clientes.length; i++) {
      if(clientes[i].getId() == id) {
        return i;
      }
    }
    return -1;
  }
  
  @Override
  public Cliente get(int id) {
    for(int i=0; i < clientes.length; i++) {
      if(clientes[i].getId() == id) {
        return clientes[i];
      }
    }
    return null;
  }
  
  @Override
  public Cliente[] list() {
    return clientes.clone();
  }
  
}
