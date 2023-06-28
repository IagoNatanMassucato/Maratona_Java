package MaratonaJava.Fase5.Exception;

import java.io.Closeable;
import java.io.IOException;

public class FileOne implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 1");
    }

}
