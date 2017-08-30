package negocio.Interfaces;

import negocio.Lance;
import negocio.Leiloeiro;

public interface IParticipante {
    Lance adamento(Lance l);
    void entrar(ILeiloeiro leilao);
    void sair();
    Lance darLance(double v);
}
