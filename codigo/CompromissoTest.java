import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// import java.beans.Transient;
public class CompromissoTest {
  Data data = new Data(2,9,2022,0);
  Compromisso compromisso = new Compromisso(data, "teste");
  @Test
  public void criarCompromissosCompletoTest() {
    assertEquals("teste:2/9/2022", compromisso.mostrarComprimisso());
  }

}
