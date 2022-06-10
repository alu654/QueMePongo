
public class Atuendo {


  public Prenda prendaSuperior;
  public Prenda prendaInferior;
  Prenda calzado;
  Prenda accesorios;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado, Prenda accesorio) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
    this.accesorios = accesorio;
  }

  public void setPrendaParteSuperior(Prenda prendasParteArriba) {
    this.prendaSuperior = prendasParteArriba;
  }

  public Prenda getPrendaParteInferior() {
    return prendaInferior;
  }

  public void setPrendaParteAbajo(Prenda prendaParteAbajo) {
    this.prendaInferior = prendaParteAbajo;
  }


}