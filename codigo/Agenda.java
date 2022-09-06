import java.util.ArrayList;
import java.util.List;

public class Agenda {
    // Lista que vai manter o compromisso organizado
    private List<CompromissoGenerico> compromisso = new ArrayList<CompromissoGenerico>();
    
    /**
     * Método que marca compromissos controlando a criação de compromisso colocando quantas vezes vai ter um compromisso
     * e qual a janela de tempo entre um compromisso e outro
     * @param quantidadeDias quantidade de dias que o compromisso irá se repetir
     * @param intervaloDias o intervalo de dia entre um compromisso e o outro
     * @param dia qual o dia que o primeiro compromisso vai acontecer
     * @param mes qual o Mês que o primeiro compromisso vai acontecer
     * @param ano qual o ano que o primeiro compromisso vai acontecer
     * @param nome o nome que será dado para o compromisso
     */
    public void marcarCompromisso(int quantidadeDias, int intervaloDias, int dia,int mes,int ano, String nome){
        int contador = 0;
        
        while (contador < quantidadeDias) {
            DataGenerico dataCompromisso = new DataGenerico(dia, mes, ano, intervaloDias);
            CompromissoGenerico compromissoNovo = new CompromissoGenerico(dataCompromisso, nome);
            compromisso.add(compromissoNovo);
            contador++;
          }

    }

    /**
     * Método que produz o relatório com todos os compromissos contendo a data e o nome dos compromissos.
     * @return nome e data de todos os compromissos.
     */
    public String relatorioCompromissos(){
        String relatorio = "";
        for (CompromissoGenerico compromissoGenerico : compromisso) {
            relatorio = compromissoGenerico.mostrarComprimisso() + " / " + relatorio;
        }
        return relatorio;

    }

    /**
     * Método que apaga compromisso da lista de compromissos que está na variável compromisso.
     * @param nome nome do compromisso que vai ser apagado
     * @param data data do compromisso que vai ser apagado
     */
    public void apagarCompromisso(String nome, String data){
        if(encontrarCompromisso(nome, data) == null){
            System.out.println("Compromisso não encontrado");
        } else {
            CompromissoGenerico compromissoApagado = encontrarCompromisso(nome, data);
            compromisso.remove(compromissoApagado);
        }
    }

    /**
     * Método privado que tem como objetivo auxiliar o método apagar compromisso encontrando o compromisso que vai ser apagado.
     * @param nome nome do compromisso para ser encontrado
     * @param data data do compromisso para ser encontrado
     * @return o compromisso que possui nome e data iguais aos do parâmetro
     */
    public CompromissoGenerico encontrarCompromisso(String nome, String data){
        for (CompromissoGenerico compromissoGenerico : compromisso) {
            if(compromissoGenerico.mostrarComprimisso().equals(nome + ":" + data) ){
                return compromissoGenerico;
            }
        }
        return null;
    }

    /**
     * Método que retorna a quantidade de compromissos dentro da lista de compromissos.
     * @return quantidade de compromissos dentro da lista de compromissos.
     */
    public int quantidadeCompromissos(){
        return this.compromisso.size();
    }
    
    
}

