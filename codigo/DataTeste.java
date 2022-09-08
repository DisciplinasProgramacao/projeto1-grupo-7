import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// import java.beans.Transient;
public class DataTeste {
  
  
  @Test
  public void dataSemIntervalo() {
    Data data = new Data(2,9,2022,0);
    assertEquals("2/9/2022", data.obterDataFormatada());
  }

  @Test
  public void dataComIntervalo() {
    Data data = new Data(2,9,2022,60);
    assertEquals("1/11/2022", data.obterDataFormatada());
  }

  @Test
  public void dataComBissexto(){
    Data data = new Data(20,2,2024,10);
    assertEquals("1/3/2024", data.obterDataFormatada());
  }

  @Test
  public void dataSemBissexto(){
    Data data = new Data(20,2,2023,10);
    assertEquals("2/3/2023", data.obterDataFormatada());
  }

  @Test
  public void dataPassarAno(){
    Data data = new Data(20,12,2023,15);
    assertEquals("4/1/2024", data.obterDataFormatada());
  }
}
