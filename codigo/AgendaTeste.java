import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AgendaTeste {
    Agenda agenda = new Agenda();
    @BeforeEach
    void init() {
        
        agenda.marcarCompromisso(1, 0, 1, 1, 2000, "Teste");
    }
    
    @Test
    public void testarAdicionarCompromisso(){
        assertEquals("Teste:01/01/2000 / ", agenda.relatorioCompromissos());
    }

    @Test
    public void quantidadeDeCompromissos(){
        assertEquals(agenda.quantidadeCompromissos(), 1);
    }

    @Test
    public void apagarCompromisso(){
        agenda.apagarCompromisso("Teste", "01/01/2000");
        assertEquals(agenda.quantidadeCompromissos(), 0);
    }

    @Test
    public void apagarCompromissoNaoExistente(){
        agenda.apagarCompromisso("Test", "01/01/2000");
        assertEquals(agenda.quantidadeCompromissos(), 1);
    }


}
