import java.util.List;

public enum TipoPrenda {
  Remera(Categoria.SUPERIOR),
  CamisaMangaCorta(Categoria.SUPERIOR),
  CamisaMangaLarga(Categoria.SUPERIOR),
  PantalonCorto(Categoria.INFERIOR),
  PantalonLargo(Categoria.INFERIOR),
  Zapatos(Categoria.CALZADO),
  OJOTAS(Categoria.CALZADO),
  ANILLO(Categoria.ACCESORIOS),
  COLLAR(Categoria.ACCESORIOS),
  ARO(Categoria.ACCESORIOS);

  List<Material> materialesDisponibles;


private Categoria categoria;

private TipoPrenda(Categoria categoria){
  this.categoria= categoria;
}

public Categoria getCategoria(){
  return  categoria;
}
  public List<Material> materialesDisponibles() {
    return materialesDisponibles;
  }

}