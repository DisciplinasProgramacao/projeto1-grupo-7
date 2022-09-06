import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// import java.beans.Transient;
public class CompromissoTest {
  Compromisso compromisso = new Compromisso();
  @Test
  public void criarCompromissosCompletoTest() {
    boolean obtido = compromisso.criarCompromissos("fulano de tal", "02-09-2022");
    assertEquals(true, obtido);
  }
  @Test
  public void criarCompromissosTest() {
    boolean obtido = compromisso.criarCompromissos("fulano de tal");
    assertEquals(true, obtido);
  }
}
