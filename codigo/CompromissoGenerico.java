public class CompromissoGenerico {
    private String data;
    private String nome;
    public CompromissoGenerico(String data, String nome){
        this.data = data;
        this.nome = nome;
    }

    public String mostrarComprimisso(){
        return this.nome + ":" + this.data;
    }

}
