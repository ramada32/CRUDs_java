public interface IFuncionarioDAO {
  
  public int inserir(Funcionario f);
  public int alterar(Funcionario f);
  public int deletaById(int id);
  public int deleteByName(String name);
  public Funcionario getById(int ids);
  public Funcionario getByName(String name);
  public Funcionario linhaemfuncionario(String line);
  public boolean contains(int id);
  public Funcionario[] getAll();
  
}
