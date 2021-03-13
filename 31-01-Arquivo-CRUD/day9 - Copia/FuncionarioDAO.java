import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FuncionarioDAO implements IFuncionarioDAO {
  private final String DATABASE = "./DB.TXT";
  private BufferedReader reader = null;
  private BufferedWriter writer = null;
  
  // 1. Criar construtor padrão
  public FuncionarioDAO() {
    openDatabase();
  }
  
  private void openDatabase() {
    //...
  }
  
  private void closeDatabase() {
    //...
  }
  
  // 2. Implementar todos os métodos de IFuncionarioDAO
  
  public int insere(Funcionario f) {
    // Gravar em Banco de Dados (Arquivo Texto)
    
    // 1. Criar um looping de leitura
    String line = null;
    while((line == FileUtils.readLine(reader)) != null) {
      String[] parts = line.split(";");
      int id = Integer.parseInt(parts[0]);
      
      // 2. Verificar se o id já não existe
      if(id == f.id) {
        // 3. Se existir emitir ERRO e sair
        sayError("Funcionario ja cadastrado!");
        return 0; // Falha
      }
    }
    
    // 4. Se não existir, inserir
    String record = "" + f.getId() + ";" + f.getNome() + ";" +
                         Utils.toString(f.getAdmissao()) + ";" +
                         f.getSalario();
    FileUtils.writeLine(writer, record);
    return 1; // Sucesso
  }
  
  public int altera(Funcionario f) {
    // 1. Criar looping
    // 2. Localizar por Id
    // 3. Se não existir emitir ERRO e sair com 0
    if(...) {
      Utils.sayError("Funcionario não cadastrado!");
      return 0;
    }
    // 4. Se existir, formatar record e 
    // 5. Gravar o record
    // 6. Retornar 1
    return 1;
  }
  
  public int deletaById(int id) {
    return 0;    
  }
  
  public int deleteByName(String name) {
    return 0;
  }
  
  public Funcionario getById(int id) {
    return null;
  }
  
  public Funcionario getByName(String name) {
    return null;
  }
  
  public Funcionario[] getAll() {
    Funcionario[] tmp = new Funcionario[0];
    return tmp;
  }

}
