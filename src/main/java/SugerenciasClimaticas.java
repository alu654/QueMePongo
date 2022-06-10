import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciasClimaticas {
  Double temperaturaActual;

  private Atuendo atuendoDeListaPrendas(List<Prenda> prendasRecomendadas) {
    Prenda parteSuperior = elegirUnaDe(prendasRecomendadas, Categoria.PARTE_SUPERIOR);
    Prenda parteInferior = elegirUnaDe(prendasRecomendadas, Categoria.PARTE_INFERIOR);
    Prenda accesorio = elegirUnaDe(prendasRecomendadas, Categoria.ACCESORIOS);
    Prenda calzado = elegirUnaDe(prendasRecomendadas, Categoria.CALZADO);
    Atuendo atuendo = new Atuendo(parteSuperior, parteInferior, calzado, accesorio);
    return atuendo;
  }

  private Prenda elegirUnaDe(List<Prenda> prendas, Categoria categoria) {
    return prendas.stream().filter(prenda -> prenda.getCategoria() == categoria).collect(Collectors.toList()).get(0);
  }
}
