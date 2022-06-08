public class CreadorDePrenda {
  private Categoria categoria;
  private TipoPrenda tipo;
  private Trama trama;
  private Material material;

  private Color colorPrimario;
  private Color colorSecundario;

  public void setCategoria(Categoria categoria){
    this.categoria = categoria;
  }


  public void setTipo(TipoPrenda tipo) {
    this.tipo = tipo;
  }

  public void setMaterial(Material material){
    this.material = material;
  }

  public void setTrama(Trama trama){
    this.trama = trama;
  }
  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }
  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}
