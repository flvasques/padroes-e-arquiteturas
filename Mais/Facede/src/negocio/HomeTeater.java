
package negocio;

public class HomeTeater implements HomeTeaterFacede{
    private Amplificador amplificador = new Amplificador();
    private LuzAmbiente luzes = new LuzAmbiente();
    private MaquinaPipoca pipoqueira = new MaquinaPipoca();
    private Tela tela = new Tela();
    private Projetor projetor = new Projetor();
    private Sintonizador radio = new Sintonizador();
    
    
    @Override
    public void wacthMovie(String movie) {
        this.pipoqueira.on();
        this.pipoqueira.pop();
        this.luzes.dim(40);
        this.tela.down();
        this.projetor.on();
        this.projetor.setDvdplayer(this.amplificador.getDvdPlayer());
        this.projetor.wideSecreenModel();
        this.amplificador.on();
        this.amplificador.setSourondSound();
        this.amplificador.setVolume(5);
        this.amplificador.getDvdPlayer().on();
        this.amplificador.getDvdPlayer().setDisco(movie);
        this.amplificador.getDvdPlayer().play();
    }

    @Override
    public void endMovie() {
        this.amplificador.getDvdPlayer().stop();
        this.amplificador.getDvdPlayer().eject();
        this.amplificador.getDvdPlayer().off();
        this.amplificador.off();
        this.projetor.off();
        this.tela.up();
        this.luzes.dim(100);
        this.pipoqueira.off();
    }

    @Override
    public void listenToCd(String cd) {
        this.luzes.dim(40);
        this.amplificador.on();
        this.amplificador.setSteroSound();
        this.amplificador.setVolume(6);
        this.amplificador.getCdPlayer().on();
        this.amplificador.getCdPlayer().setDisco(cd);
        this.amplificador.getCdPlayer().play();
    }

    @Override
    public void endCd() {
        this.amplificador.getCdPlayer().stop();
        this.amplificador.getCdPlayer().eject();
        this.amplificador.getCdPlayer().off();
        this.amplificador.off();
        this.luzes.dim(100);
        this.pipoqueira.off();
    }

    @Override
    public void listemRadio() {
        this.amplificador.on();
        this.amplificador.setSteroSound();
        this.amplificador.setVolume(6);
        this.amplificador.setTuner(radio);
        this.radio.on();
    }

    @Override
    public void endRadio() {
        this.radio.off();
        this.amplificador.off();
    }
    
}
