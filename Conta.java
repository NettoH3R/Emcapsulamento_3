import javafx.beans.property.BooleanProperty;

public class Conta{
    private String nome;
    private int idade;
    private String username;
    private String senha;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Conta(String nome, int idade, String username, String senha){
        this.nome = nome;
        this.idade = idade;
        this.username = username;
        this.senha = senha;
    }

    public boolean verificarSenha(String senha){
        return this.senha.equals(senha);
    }

    public void alterarSenha(String novaSenha){
        this.senha = novaSenha;
    }



}