import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<CompromissoGenerico> compromisso = new ArrayList<CompromissoGenerico>();
    
    public void marcarCompromisso(int quantidadeDias, int intervaloDias, int dia,int mes,int ano, int intervalo , String nome){
        int contador = 0;
        
        while (contador < quantidadeDias) {
            DataGenerico dataCompromisso = new DataGenerico(dia, mes, ano, intervalo);
            CompromissoGenerico compromissoNovo = new CompromissoGenerico(dataCompromisso, nome);
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
