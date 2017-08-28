package negocio.Interfaces;

import negocio.Lance;
import negocio.Leiloeiro;

public interface IParticipante {
    void adamento(Lance l);
    void entrar(ILeiloeiro leilao);
    void sair();
    void darLance(double v);
}
