// package trab1;

public class Data {

	int dia;
	int mes;
	int ano;

	public static void main(String[] args) {
	Data data = new Data();
	boolean resposta = data.dataValida(12, 10, 3);
	System.out.println(resposta);
	String resposta2 = data.obterDataFormatada();
	System.out.println(resposta2);
	}
	
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	public boolean anoBissexto(int ano) {
		if (ano % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean dataValida(int ano, int mes, int dia) {
		int[] maxDiaDoMes = { 31, 28, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		boolean anoBissexto = anoBissexto(ano);
		if (mes < 1 && mes > 12)
			return false;
		else if (ano < 2022)
			return false;
		if (anoBissexto && mes == 1) {
			if (dia > 29 && dia < 0)
				return false;
		} else if (dia > maxDiaDoMes[mes - 1] || dia < 0)
			return false;
			else
			this.dia = dia; 
			this.mes = mes; 
			this.ano = ano; 
			return true;
	}

}
