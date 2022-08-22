import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<CompromissoGenerico> compromisso = new ArrayList<CompromissoGenerico>();
    
    public void marcarCompromisso(int quantidadeDias, int intervaloDias, String dataInicial , String nome){
        int contador = 0;
        while (contador < quantidadeDias) {
            CompromissoGenerico compromissoNovo = new CompromissoGenerico(dataInicial, nome);
            compromisso.add(compromissoNovo);
            contador++;
          }

    }

    public String relatorioCompromissos(){
        String relatorio = "";
        for (CompromissoGenerico compromissoGenerico : compromisso) {
            relatorio = compromissoGenerico.mostrarComprimisso() + " / " + relatorio;
        }
        return relatorio;

    }

    public int quantidadeCompromissos(){
        return this.compromisso.size();
    }
    
    
}
