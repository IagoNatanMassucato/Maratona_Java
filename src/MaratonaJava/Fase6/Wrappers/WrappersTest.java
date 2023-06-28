package MaratonaJava.Fase6.Wrappers;

public class WrappersTest {
    public static void main(String[] args) {
        //Encapsulamento de Tipos Primitivos

        Byte byteT = 1;
        Short shortT = 50;
        Integer intT = 1000;
        Long longT = 52541663152L;  //AUTOBOXING
        Float floatT = 50.0F;
        Double doubleT = 253D;
        Boolean booleanT = false;
        Character charT = 'T';

        int i = intT;   //UNBOXING
        //Transformando uma String para Integer
        Integer intT2 = Integer.parseInt("1");
        Float intT3 = Float.parseFloat("51");
        //Transformando uma String para Boolean, mesmo que seja em letras maiúscula ou minúscula
        boolean verdadeiro = Boolean.parseBoolean("tRUE");
        System.out.println(verdadeiro);
        //Métodos que informa se é um digo ou não
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        //Métodos que informa se é letras maiúscula ou minúscula
        System.out.println();
        System.out.println(Character.isUpperCase('B'));
        System.out.println(Character.isUpperCase('B'));
        //Métodos que transforma o valor escrito para letras maiúscula ou minúscula
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
