public class BorradorPrenda {
   Material material;
   TipoPrenda tipo;
   Color colorPrimario;
   Color colorSecundario;
   Trama trama;

   public TipoPrenda getTipo(TipoPrenda tipo) {
      return  this.tipo = tipo;
   }

   public Material getMaterial() {
      return this.material;
   }


   public Color getColorPrimario() {
      return this.colorPrimario;
   }

   public Color getColorSecundario() {
      return this.colorSecundario;
   }

   public Trama getTrama() {
      return this.trama;
   }
   public TipoPrenda BorradorPrenda(TipoPrenda tipo){
      if(tipo == null){
         throw new ExceptionTipoIncompleto();
      }else {
         return this.tipo = tipo;
      }
   }

   public void defaultrama(Trama trama){
      if(trama == null){
         this.trama = trama.LISA;
      }else {
         this.trama = trama;
      }
   }

   public Trama getTrama(Trama trama) {
      return trama;
   }


}
