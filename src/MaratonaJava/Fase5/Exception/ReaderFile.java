package MaratonaJava.Fase5.Exception;

import java.io.*;

public class ReaderFile {
    public static void main(String[] args) {
        lerArquivo1();
    }

    public static void lerArquivo1(){
        try(FileOne leitor1 = new FileOne()){

        }catch (IOException e){

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            }catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }
}
