import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);   // para ler o teclado
        int opcao=1;            // escolha da operação pelo usuário
        int dia = 0;
        int mes = 0;
        int ano = 0;
        int quantidadeDias = 0;
        int intervaloDias = 0;
        String nome = "";
        Agenda agenda = new Agenda();

        do{
            System.out.println("Agenda");
            System.out.println("1 - Marcar Compromisso");
            System.out.println("2 - Relatório Compromisso");
            System.out.println("3 - Desmarcar Compromisso");
            System.out.println("0 - Sair");
            System.out.println("Digite opção");
            opcao = Integer.parseInt(teclado.nextLine());

            if(opcao==0){ // termina o sistema se a opÃ§Ã£o for 0
                System.out.println("Obrigado e volte sempre!");
                teclado.close();
                return;
            } 
            switch(opcao){
                case 1: 
                        System.out.println("Colocar dia");
                        dia = Integer.parseInt(teclado.nextLine());
                        System.out.println("Colocar mês");
                        mes = Integer.parseInt(teclado.nextLine());;
                        System.out.println("Colocar ano");
                        ano = Integer.parseInt(teclado.nextLine());
                        System.out.println("Colocar quantidade de dias");
                        quantidadeDias = Integer.parseInt(teclado.nextLine());
                        System.out.println("Colocar intervalo ");
                        intervaloDias = Integer.parseInt(teclado.nextLine());
                        System.out.println("Colocar nome do compromisso");
                        nome = teclado.nextLine();
                        
                        agenda.marcarCompromisso(quantidadeDias, intervaloDias, dia, mes, ano, nome);
                        System.out.println("Compromisso Marcado");
                    break;
                case 2: 
                        System.out.println(agenda.relatorioCompromissos());
                    break;
                case 3: 
                        System.out.println("Colocar dia");
                        dia = Integer.parseInt(teclado.nextLine());
                        System.out.println("Colocar mês");
                        mes = Integer.parseInt(teclado.nextLine());;
                        System.out.println("Colocar ano");
                        ano = Integer.parseInt(teclado.nextLine());
                        System.out.println("Colocar nome do compromisso");
                        nome = teclado.nextLine();

                        agenda.apagarCompromisso(nome, dia,mes,ano);
                    break;
                case 0: 
                    return;
            }
        }while(opcao!=0);   // repete-se atÃ© que o usuÃ¡rio queira sair. 
        teclado.close();
        
    }
}
