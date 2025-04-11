package negocio.Interfaces;

import modelo.Lance;
import observer.Leilao;

public interface IParticipante {
    void adamento(Lance l, boolean fim);
    void entrar(ILeiloeiro leilao);
    void sair();
    Lance darLance(double v);
    void setTelaLeilao(Leilao telaLeilao);
}
