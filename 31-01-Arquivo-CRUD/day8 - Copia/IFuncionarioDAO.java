public interface IFuncionarioDAO {
  
  public int insere(Funcionario f);
  public int altera(Funcionario f);
  public int deletaById(int id);
  public int deleteByName(String name);
  public Funcionario getById(int id);
  public Funcionario getByName(String name);
  public Funcionario[] getAll();
  
}
