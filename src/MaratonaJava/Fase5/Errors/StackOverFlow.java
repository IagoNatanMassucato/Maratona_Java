package MaratonaJava.Fase5.Errors;

public class StackOverFlow {
    public static void recursividade(){
        recursividade();
    }
    public static void main(String[] args) {
        recursividade();
    }
}
