package MaratonaJava.Fase4.ToString;

public class SobreEscrita {
    private String nome;

    @Override
    public String toString() {
        return "Anime => "+this.nome;
    }

    public SobreEscrita(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
