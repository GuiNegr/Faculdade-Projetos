package Ex1;
public class Login{
    String Login, senha;
    String LoginMarc = "Marcos";
    String SenhaMarc = "Tricolor";

    public void setLogin(String login) {
        Login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean validarlogin(String login){
        if(login.equalsIgnoreCase(LoginMarc)){
            return true;   
        }
        else{
            return false;
        }
    }
    public boolean ValidarSenha(String senha){
        if(senha.equals(SenhaMarc)){
            return true;
        }
        else{
            return false;
        }
   }
    public boolean exibição(){
        if (validarlogin(Login) && ValidarSenha(SenhaMarc)) {
            System.out.println("LOGIN ACEITO MARCOS !");
            return true;
        }
        else{
            System.out.println("ERRO! VOCE NÃO ESTÁ CADASTRADO");
            return false;
        }
    }
}