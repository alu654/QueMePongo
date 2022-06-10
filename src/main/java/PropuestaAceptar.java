public class PropuestaAceptar {
  private Prenda prenda;
  public Guardarropas guardarropas;

  public void aceptarPropuesta(Guardarropas guardarropas){
     guardarropas.agregarPrenda(this.prenda);
  }


}
