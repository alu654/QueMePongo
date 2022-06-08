import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TestPrenda {
  private Color color;
  @BeforeEach
  public void initialize() {
    color = new Color(25, 70, 125);
  }
  @Test
  public  void TieneColorSecundarioPrenda(){
    assertNull(prendaSinColorSecundario().colorSecundario);
  }

  @Test
  public Prenda prendaSinColorSecundario(){
    return new Prenda(TipoPrenda.PantalonCorto,Material.ALGODON, color , null );
  }
}
