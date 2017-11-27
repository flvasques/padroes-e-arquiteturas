
package apresentacao;

import modelo.*;

public class Main {

    public static void main(String[] args) {
        BancoUsuariosProxy joao = new BancoUsuariosProxy("João", "123");
        System.out.println(joao.getNumeroDeUsuarios());
        System.out.println(joao.getUsuariosConectados());
        joao.login("João", "123");
        System.out.println(joao.getNumeroDeUsuarios());
        System.out.println(joao.getUsuariosConectados());
        joao.logout();
    }    
}
