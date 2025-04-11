package negocio.Interfaces;

import modelo.Lance;
import observer.Loader;

public interface ILeiloeiro {
    void entar(IParticipante p);
    void desistir(IParticipante p);
    void receberLance(Lance l);
    void iniciar(double v);
}
