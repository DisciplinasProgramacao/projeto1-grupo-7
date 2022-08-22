import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class AgendaTeste {
    @Test
    public void testarAdicionarCompromisso(){
        Agenda agenda = new Agenda();
        agenda.marcarCompromisso(1, 0, "01/01/02", "Teste");
        assertEquals("Teste:01/01/02 / ", agenda.relatorioCompromissos());
    }

    @Test
    public void quantidadeDeCompromissos(){
        Agenda agenda = new Agenda();
        agenda.marcarCompromisso(1, 0, "01/01/02", "Teste");
        assertEquals(agenda.quantidadeCompromissos(), 1);
    }


}
