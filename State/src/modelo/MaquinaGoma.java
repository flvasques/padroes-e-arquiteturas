
package modelo;


public class MaquinaGoma {
    private MaquinaGomaEstado estado = new SemMoeda(this);
    private int gomas = 2;
    
   public void recebeMoeda(){
      estado = estado.insereMoeda(gomas);
   }
   
   public void ejetaMoeda(){
      estado = estado.ejetaMoeda();
   }
   
   public void alavancaAcionada(){
      estado = estado.acionaAlavanca(gomas);
   }
   
   public void entregarGoma(){
      estado =  estado.entregaGoma(gomas);
   }
   public void setGoma(){
       gomas--;
   }
}
