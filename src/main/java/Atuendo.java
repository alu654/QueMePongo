
public class Atuendo {
  Prenda prendasParteArriba;
  Prenda prendaParteAbajo;
  Prenda calzado;
  Prenda accesorios;

  public Prenda superior;
  public Prenda inferior;


  public void setPrendaParteSuperior(Prenda prendasParteArriba) {
    this.prendasParteArriba = prendasParteArriba;
  }

  public Prenda getPrendaParteInferior() {
    return prendaParteAbajo;
  }

  public void setPrendaParteAbajo(Prenda prendaParteAbajo) {
    this.prendaParteAbajo = prendaParteAbajo;
  }


}