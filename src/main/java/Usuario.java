import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class Usuario {
  private List<Guardarropas> guardarropas;
  private List<Prenda> sugerenciasEliminar = new ArrayList<>();
  private List<Prenda> prendas = new ArrayList<>();




  public Usuario(List<Guardarropas> guardarropas) {
    this.guardarropas = guardarropas;
  }
  public Guardarropas getGuardarropa(Integer posicion){
    return this.guardarropas.get(posicion);
  }

  public void agregarPrendasAlGuardarropa(Guardarropas guardarropa, Prenda ... prendas){
    Integer guardarropaPosicion = guardarropas.indexOf(guardarropas);
    Guardarropas guardarropaElegido = guardarropas.get(guardarropaPosicion);
    guardarropaElegido.agregarPrendas(prendas);
  }


  public List<Prenda> getSugerenciasEliminar(){
    return sugerenciasEliminar;
  }

  public void eliminarPrenda(Prenda prenda){
    if (!this.estaEnElGuardarropa(prenda)){
      throw new RuntimeException("La prenda que recomienda eliminar no forma parte de las prendas del guardarropa.");
    }
    this.getSugerenciasEliminar().add(prenda);
  }
  public List<Prenda> getPrendas() {
    return prendas;
  }

  private boolean estaEnElGuardarropa(Prenda prenda) {
    return this.getPrendas().contains(prenda);
  }


}
