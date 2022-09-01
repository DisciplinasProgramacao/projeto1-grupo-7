public class CompromissoGenerico {
    private String data;
    private String nome;
    public CompromissoGenerico(DataGenerico data, String nome){
        this.data = data.retornoData();
        this.nome = nome;
    }

    public String mostrarComprimisso(){
        return this.nome + ":" + this.data;
    }

}
