package MaratonaJava.Fase6.ClssString;

import MaratonaJava.Fase5.ExceptionNotExist.LoginInvalidoException;

public class StringTest {
    public static void main(String[] args) {
        String exemplo1 = "Oi";
        String exemplo2 = "Oe";
        //Método que compara os valores das String
        if(!exemplo1.equals(exemplo2) || (!exemplo2.equals(exemplo1))){
            System.out.println("Não são iguais");
        }
        //Operador que compara a referência da String
        System.out.println(exemplo1 == exemplo2);
        //A variavel do Pool String nunca sera auterada
        exemplo1 = exemplo1.concat(",Tudo Bem");
        System.out.println(exemplo1);
        //Criando uma variavel fora do Pool String
        String exemplo3 = new String("Iago");
        //Método que compara uma variavel fora do Pool String com uma variavel dentro do Pool String
        System.out.println(exemplo2 == exemplo3.intern());
        //Método que retorna a letra da String equivalente ao índice
        String exemplo4 = "Luffy"; //contando o primeiro índece apartir do 0
        System.out.println(exemplo4.charAt(1));
        //Método que mostra quantos índeces tem a variavel String, contando o primeiro índece apartir do 1
        System.out.println(exemplo4.length());
        //Método que troca todas as letras iguais da variavel String
        System.out.println(exemplo4 = exemplo4.replace("f","z"));
        System.out.println(exemplo4);
        //Métodos que transforma o valor escrito para letras maiúscula ou minúscula
        System.out.println(exemplo4.toUpperCase());
        System.out.println(exemplo4.toLowerCase());
        System.out.println();
        //Método que retorna de um índice até o outro índice informado
        String exemplo5 = "Massucato";
        System.out.println(exemplo5.substring(0, 3));
        System.out.println(exemplo5.substring(2, exemplo5.length()));
        //Método que remove os valores em brancos do começo e final da String
        String exemplo6 = "            Zoro   ";
        System.out.println(exemplo6);
        System.out.println(exemplo6.trim());
        System.out.println(exemplo6.length());
        exemplo6 = exemplo6.trim();
        System.out.println(exemplo6.length());
    }
}
