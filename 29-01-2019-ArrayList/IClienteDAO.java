public interface IClienteDAO {
  
  public int insere(Cliente cliente);
  public int altera(Cliente cliente);
  public int deleta(int id);
  public int indexOf(int id);
  public Cliente get(int id);
  public Cliente[] list();
  
}
