public class Data {

	int dia;
	int mes;
	int ano;

	/**
	 * Metodo criado para formatar a data para String
	 * 
	 * @return retorna a data formatada
	 */
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

	/**
	 * Metodo criado para analizar se o ano é bissexto ou seja, Para ser bissexto, o
	 * ano deve ser:
	 * Divisível por 4 e nao pode ser divisível por 100.
	 * 
	 * @param ano é necessario saber o ano para fazer a devida conta
	 * @return retorna true, caso o ano seja bissexto e false caso nao seja
	 */
	public boolean anoBissexto(int ano) {
		if (ano % 4 == 0 && ano % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo criado para saber se a data é valida
	 * 
	 * @param ano o metodo so aceita anos a partir de 2022 (ja que os compromissos
	 *            so aconteceram no futuro)
	 * @param mes o metodo atua como no calendario, meses de 1 a 12
	 * @param dia os dias sao analizados de acordo com o ano (se é ou nao bissexto)
	 *            e o mes.
	 * @return retorna false, caso os valores passados nao formem uma data valida e
	 *         caso contrario, true
	 */
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
    /**
	 * Metodo criado validar uma data em formato de String
	 * @param data recebe uma data em formato de string seguindo o padrao "dd/mm/yyyy"
	 * @return retorna true caso a data seja valida e caso contrario, false 
	 */
	public boolean dataValida(String data) {
        String[] vetorData = data.split("/");
		int dia = Integer.parseInt(vetorData[0]);
		int mes = Integer.parseInt(vetorData[1]);
		int ano = Integer.parseInt(vetorData[2]);
		boolean dataValida = dataValida(ano, mes, dia);
		if(dataValida) return true;
		else return false;
	}
}
