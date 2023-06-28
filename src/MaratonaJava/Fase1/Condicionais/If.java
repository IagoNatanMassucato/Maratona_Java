package MaratonaJava.Fase1.Condicionais;

public class If {
    public String nome;
    public  int idade;

    public If(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void acessoVoto(){
        String menssagem;
        if(idade < 15){
            menssagem = " Não pode votar !!!";
        }else if(idade > 15 && idade < 18){
            menssagem = " Não é obrigatório votar !!!";
        }else {
            menssagem = " Tem que votar !!!";
        }

        System.out.println(nome);
        System.out.println(menssagem);
    }

}
