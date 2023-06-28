package MaratonaJava.Fase5.Exception;

public class Finally {
    public static void main(String[] args) {
        openConnection();
    }
    private static String openConnection(){
        try{
            System.out.println("Abrindo Arquivo !");
            System.out.println("Escrevendo Dados no Arquivo !");
            return "Conexão Aberta";
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando Recurso Leberado pelo SO !!!");
        }
        return null;
    }
}
