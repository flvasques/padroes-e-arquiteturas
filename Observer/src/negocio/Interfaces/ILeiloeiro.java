package negocio.Interfaces;

import negocio.Lance;
import observer.Loader;

public interface ILeiloeiro {
    void entar(IParticipante p);
    void desistir(IParticipante p);
    void receberLance(Lance l);
    void iniciar(double v);
    void setPai(Loader l);
    Loader getPai();
}
