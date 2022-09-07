public class Compromisso {
  private String nomeCompromisso;
  private String dataCompromisso;

  /**
   * Construtor da Classe, passando todos os atribuos
   * 
   * @param nomeCompromisso O nome ou a descricao do comprimisso a ser agendado
   * @param dataCompromisso A data que ocorrera o comprimisso, sendo permitido
   *                        apenas datas a partir de 2022
   * @return retorna true, caso um novo compromisso tenha sido criado, e false
   *         caso a data informada tenha sido invalida impossibilitando que o
   *         compromisso seja criado
   */
  public boolean criarCompromissos(String nomeCompromisso, String dataCompromisso) {
    Data data = new Data();
    boolean dataValida = data.dataValida(dataCompromisso);
    if (dataValida) {
      this.nomeCompromisso = nomeCompromisso;
      this.dataCompromisso = dataCompromisso;
      return true;
    }

    return false;
  }

  /**
   * Construtor da Classe, passando apenas o nome ou a descricao
   * 
   * @param nomeCompromisso O nome ou a descricao do comprimisso a ser agendado
   * @return retorna true, para informar que a classe foi criada
   */
  public boolean criarCompromissos(String nomeCompromisso) {
    this.nomeCompromisso = nomeCompromisso;
    this.dataCompromisso = "Nao definida";

    return true;
  }
}
