public class Compromisso {
    private String data;
    private String nome;
    /**
     * Construtor da classe compromisso, nela o compromisso é criado com data e nome dele
     * @param data data do compromisso
     * @param nome nome do compromisso
     */
    public Compromisso(Data data, String nome){
        this.data = data.obterDataFormatada();
        this.nome = nome;
    }
    /**
     * Método que retorna o nome e a data do compromisso 
     * @return String do nome e data do compromisso
     */
    public String mostrarComprimisso(){
        return this.nome + ":" + this.data;
    }

}

