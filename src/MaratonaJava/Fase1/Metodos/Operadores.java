package MaratonaJava.Fase1.Metodos;

public class Operadores {

    public int somaDoisNm(int num1, int num2){
       return num1 + num2;
    }
    public int subtrairDoisNm(int num1, int num2){
        return num1 - num2;
    }
    public double divideDoisNm(double num1, double num2){
        return num1 / num2;
    }

    public static void metodoStatic(){
        System.out.println("Métodos static só podem ser execultados uma vez !");
    }

    public void infOperadores(){
        System.out.println("Método de Adição");
        System.out.println("Método de Subtração");
        System.out.println("Método de Divisão");
    }
}

