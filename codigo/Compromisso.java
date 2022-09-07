import java.util.Scanner;
public class Compromisso {
  private String nomeCompromisso;
  private String dataCompromisso;

  public boolean criarCompromissos(String nomeCompromisso,String dataCompromisso) {
    this.nomeCompromisso = nomeCompromisso;
    this.dataCompromisso = dataCompromisso;
    
    return true;
  }
  public boolean criarCompromissos(String nomeCompromisso) {
    this.nomeCompromisso = nomeCompromisso;
    this.dataCompromisso = "Nao definida";
 
    return true;
  }
}
