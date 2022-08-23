// package trab1;

public class Data {

	int dia;
	int mes;
	int ano;

	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	boolean anoBissexto() {
		double ano = 2020;

		if (ano % 4 == 0) {
			return true;
		}else{
			return false;
		}
	}

	boolean dataValida() {
		int[] diaDoMes = {31,28,29,31,30,31,30,31,31,30,31,30,31};

		System.out.println(diaDoMes[1]);
		if (ano < 2022)
			return false;
		 else if (mes < 1 && mes > 12) 
			return false;
		 else 
			return true;
	}

}