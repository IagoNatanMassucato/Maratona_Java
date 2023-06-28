package MaratonaJava.Fase5.Exception;

import java.io.File;
import java.io.IOException;

public class NewFileDir {
    public static void main(String[] args) throws IOException {
        newFile();
    }
    private static void newFile() throws IOException {
        File file = new File("fase5Arquivos\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado =>"+isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
