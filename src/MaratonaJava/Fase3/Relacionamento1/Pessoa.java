package MaratonaJava.Fase3.Relacionamento1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Pessoa {

    private String nome;
    private int idade;
    private Documento docm;
    private double[] salarios;
    public double media;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Documento getDocm() {
        return docm;
    }

    public void setDocm(Documento docm) {
        this.docm = docm;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void resultMedia(){
        if (salarios == null){
            return;
        }
        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        String padraoReaisPt = "###,###.##";
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt","Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat(padraoReaisPt, dfs);

        System.out.println("Média dos salarios => "+df.format(media));
    }
    public void infPessoa() {
        System.out.println("Dados");
        System.out.println("Nome => " + this.nome);
        System.out.println("Idade => " + this.idade);
        System.out.println();
        if (salarios == null){
            return;
        }
        System.out.println("Salários");
        for (double i : salarios) {
            System.out.println("R$  " + i);
        }
    }
}
