import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AgendaTeste {
    Agenda agenda = new Agenda();
    @BeforeEach
    void init() {
        
        agenda.marcarCompromisso(3, 2, 1, 1, 2022, "Teste");
    }
    
    @Test
    public void testarAdicionarCompromisso(){
        assertEquals("Teste:5/1/2022 / Teste:3/1/2022 / Teste:1/1/2022 / ", agenda.relatorioCompromissos());
    }

    @Test
    public void quantidadeDeCompromissos(){
        assertEquals(agenda.quantidadeCompromissos(), 3);
    }

    @Test
    public void apagarCompromisso(){
        agenda.apagarCompromisso("Teste", 1,1,2022);
        assertEquals(agenda.quantidadeCompromissos(), 2);
    }

    @Test
    public void apagarCompromissoNaoExistente(){
        agenda.apagarCompromisso("Test", 1,1,2022);
        assertEquals(agenda.quantidadeCompromissos(), 3);
    }


}
