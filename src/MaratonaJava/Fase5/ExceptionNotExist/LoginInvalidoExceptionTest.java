package MaratonaJava.Fase5.ExceptionNotExist;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
    try {
        logar();
    }catch (LoginInvalidoException e){
        e.printStackTrace();
    }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner scn = new Scanner(System.in);
        String username = "Goku";
        String password = "ssj";
        System.out.println("Usuário");
        String usernameScanner = scn.nextLine();
        System.out.println("Senha");
        String passwordScanner = scn.nextLine();
        if(!username.equals(usernameScanner) || !password.equals(passwordScanner)){
            throw new LoginInvalidoException("Usuário ou Senha Inválidos");
        }
        System.out.println("Usuário Logado com Sucesso");
    }
}
