import java.util.ArrayList;
import java.util.List;

public class Agenda {
    // Lista que vai manter o compromisso organizado
    private List<Compromisso> compromissos = new ArrayList<Compromisso>();
    
    /**
     * M�todo que marca compromissos controlando a cria��o de compromisso colocando quantas vezes vai ter um compromisso
     * e qual a janela de tempo entre um compromisso e outro
     * @param quantidadeDias quantidade de dias que o compromisso ir� se repetir
     * @param intervaloDias o intervalo de dia entre um compromisso e o outro
     * @param dia qual o dia que o primeiro compromisso vai acontecer
     * @param mes qual o M�s que o primeiro compromisso vai acontecer
     * @param ano qual o ano que o primeiro compromisso vai acontecer
     * @param nome o nome que ser� dado para o compromisso
     */
    public void marcarCompromisso(int quantidadeDias, int intervaloDias, int dia,int mes,int ano, String nome){
        int contador = 0;
        
        while (contador < quantidadeDias) {
            DataGenerico dataCompromisso = new DataGenerico(dia, mes, ano, intervaloDias);
            Compromisso compromissoNovo = new Compromisso(dataCompromisso, nome);
            compromissos.add(compromissoNovo);
            contador++;
          }

    }

    /**
     * M�todo que produz o relat�rio com todos os compromissos contendo a data e o nome dos compromissos.
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
     * M�todo que apaga compromisso da lista de compromissos que est� na vari�vel compromisso.
     * @param nome nome do compromisso que vai ser apagado
     * @param data data do compromisso que vai ser apagado
     */
    public void apagarCompromisso(String nome, String data){
        if(encontrarCompromisso(nome, data) == null){
            System.out.println("Compromisso n�o encontrado");
        } else {
            Compromisso compromissoApagado = encontrarCompromisso(nome, data);
            compromissos.remove(compromissoApagado);
        }
    }

    /**
     * M�todo privado que tem como objetivo auxiliar o m�todo apagar compromisso encontrando o compromisso que vai ser apagado.
     * @param nome nome do compromisso para ser encontrado
     * @param data data do compromisso para ser encontrado
     * @return o compromisso que possui nome e data iguais aos do par�metro
     */
    public Compromisso encontrarCompromisso(String nome, String data){
        for (Compromisso compromisso : compromissos) {
            if(compromisso.mostrarComprimisso().equals(nome + ":" + data) ){
                return compromisso;
            }
        }
        return null;
    }

    /**
     * M�todo que retorna a quantidade de compromissos dentro da lista de compromissos.
     * @return quantidade de compromissos dentro da lista de compromissos.
     */
    public int quantidadeCompromissos(){
        return this.compromissos.size();
    }
    
    
}

