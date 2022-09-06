// package trab1;

public class Data {

	int dia;
	int mes;
	int ano;

	public static void main(String[] args) {
		Data obj = new Data();
		boolean boo = obj.dataValida();
		if (!boo) {
			System.out.println("data invalida");
		} else {
			System.out.println("data valida");
		}
	}

	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	public boolean anoBissexto() {
		if (ano % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean dataValida() {
		Data obj = new Data();
		int[] maxDiaDoMes = { 31, 28, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		boolean anoBissexto = obj.anoBissexto();
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
			return true;
	}

}
