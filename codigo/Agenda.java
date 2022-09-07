import java.util.ArrayList;
import java.util.List;

public class Agenda {
    // Lista que vai manter o compromisso organizado
    private List<Compromisso> compromissos = new ArrayList<Compromisso>();
    
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
        if(quantidadeDias == 0){
            Data dataCompromisso = new Data(dia, mes, ano, intervaloDias);
            Compromisso compromissoNovo = new Compromisso(dataCompromisso, nome);
            compromissos.add(compromissoNovo);
        }else{
            while (contador < quantidadeDias) {
                int intervaloDiasEmQuestao = intervaloDias * contador;
                Data dataCompromisso = new Data(dia, mes, ano, intervaloDiasEmQuestao);
                Compromisso compromissoNovo = new Compromisso(dataCompromisso, nome);
                compromissos.add(compromissoNovo);
                contador++;
            }
        }


    }

    /**
     * Método que produz o relatório com todos os compromissos contendo a data e o nome dos compromissos.
     * @return nome e data de todos os compromissos.
     */
    public String relatorioCompromissos(){
        String relatorio = "";
        for (Compromisso compromisso : compromissos) {
            relatorio = compromisso.mostrarComprimisso() + " / " + relatorio;
        }
        return relatorio;

    }

    /**
     * Método que apaga compromisso da lista de compromissos que está na variável compromisso.
     * @param nome nome do compromisso que vai ser apagado
     * @param data data do compromisso que vai ser apagado
     */
    public void apagarCompromisso(String nome, int dia, int mes, int ano){
        Data dataCompromisso = new Data(dia, mes, ano, 0);
        if(encontrarCompromisso(nome, dataCompromisso) == null){
            System.out.println("Compromisso não encontrado");
        } else {
            Compromisso compromissoApagado = encontrarCompromisso(nome, dataCompromisso);
            compromissos.remove(compromissoApagado);
        }
    }

    /**
     * Método privado que tem como objetivo auxiliar o método apagar compromisso encontrando o compromisso que vai ser apagado.
     * @param nome nome do compromisso para ser encontrado
     * @param data data do compromisso para ser encontrado
     * @return o compromisso que possui nome e data iguais aos do parâmetro
     */
    public Compromisso encontrarCompromisso(String nome, Data data){
        for (Compromisso compromisso : compromissos) {
            if(compromisso.mostrarComprimisso().equals(nome + ":" + data.obterDataFormatada()) ){
                return compromisso;
            }
        }
        return null;
    }

    /**
     * Método que retorna a quantidade de compromissos dentro da lista de compromissos.
     * @return quantidade de compromissos dentro da lista de compromissos.
     */
    public int quantidadeCompromissos(){
        return this.compromissos.size();
    }
    
    
}

