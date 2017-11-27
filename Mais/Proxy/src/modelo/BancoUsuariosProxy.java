
package modelo;

public class BancoUsuariosProxy {
    private String login, senha;
    private boolean hasLogin = false;
    private BancoUsuarios banco;

    public BancoUsuariosProxy(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public boolean login(String usuario,String senha){
        if(this.login.equals(usuario) && this.senha.equals(senha)){
            this.banco = new BancoUsuarios();
            this.hasLogin = true;
            return true;
        }
        return false;
    }
    
    public void logout(){
        this.hasLogin = false;
    }
    
    public String getNumeroDeUsuarios(){
        if(this.hasLogin){
             return this.banco.getNumeroDeUsuarios();
        }else{
            System.out.println("Faça login para continuar");
            return null;
        }
    }
    
    public String getUsuariosConectados() {
        if(this.hasLogin){
             return this.banco.getUsuariosConectados();
        }else{
            System.out.println("Faça login para continuar");
            return null;
        }
    }
}
