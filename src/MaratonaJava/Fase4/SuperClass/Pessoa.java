package MaratonaJava.Fase4.SuperClass;

public class Pessoa {

    private String nome;
    private long rg;
    private long cpf;

    public Pessoa(String nome, long rg, long cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    public void infPessoa(){
        System.out.println("Nome => "+this.nome);
        System.out.println("RG => "+this.rg);
        System.out.println("CPF => "+this.cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
