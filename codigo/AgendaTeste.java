import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class AgendaTeste {
    @Test
    public void testarAdicionarCompromisso(){
        Agenda agenda = new Agenda();
        agenda.marcarCompromisso(1, 0, 1, 1, 2000, 0, "Teste");
        assertEquals("Teste:01/01/2000 / ", agenda.relatorioCompromissos());
    }

    @Test
    public void quantidadeDeCompromissos(){
        Agenda agenda = new Agenda();
        agenda.marcarCompromisso(1, 0, 1, 1, 2000, 0, "Teste");
        assertEquals(agenda.quantidadeCompromissos(), 1);
    }


}
