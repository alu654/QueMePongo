import java.util.List;

public enum TipoPrenda {
  Remera(Categoria.PARTE_SUPERIOR),
  CamisaMangaCorta(Categoria.PARTE_SUPERIOR),
  CamisaMangaLarga(Categoria.PARTE_SUPERIOR),
  PantalonCorto(Categoria.PARTE_INFERIOR),
  PantalonLargo(Categoria.PARTE_INFERIOR),
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