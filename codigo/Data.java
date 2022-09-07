// package trab1;

public class Data{

	int dia;
	int mes;
	int ano;
	int intervaloDias;
	/**
	 * Construtor da classe data, checa se a data é verdadeira e calcula
	 * se tiver intervalo de dias para a data do compromisso que será criado
	 * @param dia dia do compromisso se for sem intervalo de dias é o padrão, se tiver intervalo de dias vai ser o dia como parametro.
	 * @param mes mes do compromisso se for sem intervalo de dias é o padrão, se tiver intervalo de dias vai ser o mes como parametro.
	 * @param ano ano do compromisso se for sem intervalo de dias é o padrão, se tiver intervalo de dias vai ser o ano como parametro.
	 * @param intervaloDias intervalo de dias a serem somadas a data.
	 */
	public Data(int dia, int mes, int ano, int intervaloDias){
		if(intervaloDias == 0 && dataValida(dia, mes, ano) == 5){
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			dataComIntervalo(dia, mes, ano, intervaloDias);
		}

	}

	/**
	 * obter data final em string da maneira correta
	 * @return Data em formato String
	 */
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	/**
	 * Retorna se o ano é bissexto ou não
	 * @param ano parametro usando em função data válida
	 * @return false para não bissexto true para bissexto
	 */
	private boolean anoBissexto(int ano) {
		if (ano % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private int dataValida(int dia, int mes, int ano) {
		int[] maxDiaDoMes = { 31, 28, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		

		// 1 para datas falsas, 2 para passar mês, 3 para passar ano e 5 está correto
		if (mes < 1 && mes > 12){
			return 1;
		} else if (ano < 2022) {
			return 1;
		} else if (anoBissexto(ano) && mes == 2) {
			System.out.println(dia);
			if (dia > 28){
				return 2;
			}
			return 5;
		} else if (dia >= maxDiaDoMes[mes - 1]){
			if(mes == 12){
				return 3;
			}
			return 2;
		} else {
			return 5;
		}

	}
	
	private void dataComIntervalo(int dia, int mes, int ano, int intervaloDias){
		int auxDia = dia;
		int auxMes = mes;
		int auxAno = ano;
		for (int i = 0; i < intervaloDias; i++) {
			auxDia++;
			switch (dataValida(auxDia, auxMes, auxAno)) {
				case 1:
						System.out.println("Não existe data");
					break;
				case 2:
					auxDia = 1;
					auxMes++;
					break;
				case 3:
					auxDia = 1;
					auxMes = 1;
					auxAno++;
					break;
				case 5:
					break;
				default:
					break;
			}
			
		}
		this.dia = auxDia;
		this.mes = auxMes;
		this.ano = auxAno;

	}

}
