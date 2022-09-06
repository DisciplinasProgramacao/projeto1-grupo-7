public class Compromisso {
  private String nomeCompromisso;
  private String dataCompromisso;

  /**
   * Construtor da Classe, passando todos os atribuos
   * @param nomeCompromisso O nome ou a descricao do comprimisso a ser agendado
   * @param dataCompromisso A data que ocorrera o comprimisso
   * @return retorna true, caso a classe tenha sido criada
   */
  public boolean criarCompromissos(String nomeCompromisso,String dataCompromisso) {
    Data data = new Data();
    data.dataValida();
    this.nomeCompromisso = nomeCompromisso;
    this.dataCompromisso = dataCompromisso;
    
    return true;
  }

  /**
   * Construtor da Classe, passando apenas o nome ou a descricao 
   * @param nomeCompromisso O nome ou a descricao do comprimisso a ser agendado
   * @return retorna true, para informar que a classe foi criada
   */
  public boolean criarCompromissos(String nomeCompromisso) {
    this.nomeCompromisso = nomeCompromisso;
    this.dataCompromisso = "Nao definida"; 
 
    return true;
  }
}
