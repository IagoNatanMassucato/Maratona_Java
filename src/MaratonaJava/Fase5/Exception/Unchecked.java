package MaratonaJava.Fase5.Exception;

public class Unchecked {
    public static void main(String[] args){
        System.out.println(divisao(1,0));
    }
    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento Ilegal, o valor não pode ser 0");
        }
        return a/b;
    }
}
