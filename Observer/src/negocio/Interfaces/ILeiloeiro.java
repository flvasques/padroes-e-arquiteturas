package negocio.Interfaces;

import negocio.Lance;

public interface ILeiloeiro {
    void entar(IParticipante p);
    void desistir(IParticipante p);
    void receberLance(Lance l);
   
}
