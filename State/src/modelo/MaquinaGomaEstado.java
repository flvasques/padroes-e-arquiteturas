
package modelo;

public interface MaquinaGomaEstado {
   MaquinaGomaEstado insereMoeda(int g);
   MaquinaGomaEstado ejetaMoeda();
   MaquinaGomaEstado acionaAlavanca(int g);
   MaquinaGomaEstado entregaGoma(int g);
}
