
public class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrimario;
  Color colorSecundario;
  Double temperaturaMaxima;
  Categoria categoria;

  public Prenda(TipoPrenda tipo, Material material, Color colorPrimario, Color colorSecundario ) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public TipoPrenda getTipoPrenda() {
    return tipo;
  }

  public Material getMaterial() {
    return material;
  }
  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public void setTipo(TipoPrenda tipo) {
    this.tipo = tipo;
  }
  public TipoPrenda getTipoDePrenda() {
    return tipo;
  }
  public Categoria getCategoria() {
    return categoria;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }


  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public String descripcion(){
    String texto = this.getTipoPrenda() + " de " + this.getMaterial() + " y de color " + this.getColorPrimario();
    return texto;
  }
  public void prendaValida() throws Exception {
    if (tipo  == null || material == null || colorPrimario == null){
       throw new Exception("Uno o mas campos esta erroneo");
    }

  }
  public boolean aptaParaTemperaturaEspecifica(Double temperatura){
    return temperatura < temperaturaMaxima;
  }

}