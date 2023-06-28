package MaratonaJava.Fase3.Relacionamento1;

public class Documento {
    private long cpf;
    private long rg;
    public long getCpf() {
        return cpf;
    }

    public long getRg() {
        return rg;
    }
    public Documento(long cpf, long rg) {
        this.cpf = cpf;
        this.rg = rg;
    }
    @Override
    public String toString() {
        return "Documento{" +
                "cpf=" + cpf +
                ", rg=" + rg +
                '}';
    }
}
