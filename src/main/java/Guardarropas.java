import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Guardarropas {


  List<Prenda> prendas;
  private List<Usuario> duenios = new ArrayList<>();
  private List<Prenda> sugerenciasAgregar = new ArrayList<>();
  private List<Prenda> sugerenciasEliminar = new ArrayList<>();
  private PropuestaAceptar propuesta;




  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void agregarPrenda(Prenda prenda){
    prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    prendas.remove(prenda);
  }


  public Guardarropas(List<Usuario> duenios) {
    this.duenios = duenios;
  }

  public void agregarPrendas(Prenda ... prendas){
    Collections.addAll(this.getPrendas(),prendas);
  }

  public List<Prenda> getSugerenciasEliminar() {
    return sugerenciasEliminar;
  }

  public void Guardarropas(Guardarropas guardarropas){
    propuesta.aceptarPropuesta(guardarropas);
  }
  public List<Prenda> getSugerenciasAgregar() {
    return sugerenciasAgregar;
  }

  public String prendasAAgregar(){
    StringBuilder texto = new StringBuilder("Selecciona la prenda a agregar de las recomendadas por otros usuarios: \n ");
    List<Prenda> listaAAgregar = this.getSugerenciasAgregar();
    texto.append(listaAAgregar);
    return texto.toString();
  }

  public String listarPrendasAEliminar(){
    StringBuilder texto = new StringBuilder("Selecciona la prenda que quieras eliminar de las recomendadas por otros usuarios: \n ");
    List<Prenda> listaAEliminar = this.getSugerenciasEliminar();
    texto.append(listaAEliminar);
    return texto.toString();
  }


}
