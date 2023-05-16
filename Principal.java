import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta("José", 17, "José", "1234");
    
        System.out.println("Nome: " + conta1.getNome());
        System.out.println("Idade: " + conta1.getIdade());
        System.out.println("Username: " + conta1.getUsername());
        conta1.setSenha("Etec2023");
    
        if(conta1.verificarSenha("Etec2023")){
            System.out.println("senha Valida!");
        }else{
            System.out.println("Senha invalida!"); 
            
        }
    }
}
