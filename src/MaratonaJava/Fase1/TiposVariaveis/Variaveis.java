package MaratonaJava.Fase1.TiposVariaveis;

public class Variaveis {
    public  byte numeroPequeno = 127;
    public short numero = 32767;
    public int numeroMedio = 2147483647;
    public long numeroGrande = 3607816204593496316L;
    public  double numeroGrandeDecimal = 905000.00;
    public float numeroPequenoDecimal = 250.00F;
    boolean isTru = false;
    char caractere = 'M';

    public String texto = "String é uma classe";



    public void InfDadosPrimitivos(){
        System.out.println("-------------------------");
        System.out.println("Variáveis Tipos Primitivos");
        System.out.println("-------------------------");
        System.out.println("Números Inteiros");
        System.out.println("BYTE => "+numeroPequeno);
        System.out.println("SHORT => "+numero);
        System.out.println("INT => "+numeroMedio);
        System.out.println("LONG => "+numeroGrande);
        System.out.println("-------------------------");
        System.out.println("Números Decimal");
        System.out.println("FLOAT => "+numeroPequenoDecimal);
        System.out.println("DOUBLE => "+numeroGrandeDecimal);
        System.out.println("-------------------------");
        System.out.println("Variável tipo texto: STRING => "+ texto);
        System.out.println("Apenas uma silaba CARACTERE => "+caractere);
        System.out.println("-------------------------");
        System.out.println("BOOLEAN = Verdadeiro | Falso");



    }


}
