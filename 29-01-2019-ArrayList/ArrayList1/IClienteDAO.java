public interface IClienteDAO {
  
  public int insere(Cliente cliente);
  public int altera(Cliente cliente);
  public int deleta(int id);
  public int deleta(String nome);
  public int indexOf(int id);
  public int indexOf(String nome);
  public Cliente get(int id);
  public Cliente[] list();
  
}
