package MaratonaJava.Fase3;
import MaratonaJava.Fase3.Relacionamento1.Pessoa;
import MaratonaJava.Fase3.ObjArray.Anime;
import MaratonaJava.Fase3.Relacionamento1.Documento;
import MaratonaJava.Fase3.Relacionamento1N.Jogador;
import MaratonaJava.Fase3.Relacionamento1N.Time;
import MaratonaJava.Fase3.SytSemin.Aluno;
import MaratonaJava.Fase3.SytSemin.Local;
import MaratonaJava.Fase3.SytSemin.Professor;
import MaratonaJava.Fase3.SytSemin.Seminario;

public class Execucao3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Atributo Private, Método Get, Set e Formatação de Números Decimal");
        System.out.println();
        Pessoa pessoa1 = new Pessoa("Iago Natan", 19);
        pessoa1.setSalarios(new double[]{1500.00, 1200.00, 1700.00});
        pessoa1.infPessoa();
        pessoa1.resultMedia();

        System.out.println("--------------------------------");
        System.out.println("Vetor que Armazena Vários Objetos");
        System.out.println();
        Anime naruto = new Anime("Naruto");
        Anime dragonboll = new Anime("Dragonboll");
        Anime onePiece = new Anime("One Piece");
        Anime[] todosAnimes = new Anime[]{naruto, dragonboll, onePiece};

        System.out.println("--------------------------------");
        System.out.println("Relacionamento 1:N");
        System.out.println();
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador jogador4 = new Jogador("Davi Luiz");
        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4};
        Time brasil = new Time("Seleção Brasileira", jogadores);
        brasil.imprimeT();
        System.out.println("--------------------------------");
        System.out.println("Relacionamento 1:1");
        System.out.println();
        Documento pessoa1Docm = new Documento(0206216543L, 40263913284L);
        pessoa1.setDocm(pessoa1Docm);
        System.out.println("Nome => "+pessoa1.getNome());
        System.out.println("Idade => "+pessoa1.getIdade());
        System.out.println("CPF => "+pessoa1Docm.getCpf());
        System.out.println("RG => "+pessoa1Docm.getRg());
        System.out.println("--------------------------------");
        System.out.println("Relacionamento N:N");
        System.out.println("--------------------------------");
        System.out.println("Sistema Seminários");
        System.out.println();
        Local local1 = new Local("Bairro Água Brava, Rua Eurico Poletti");
        Local local2 = new Local("Vila Operaria, Rua Antônio Reginato");
        Aluno aluno1 = new Aluno("Ace", 20);
        Aluno aluno2 = new Aluno("Luffy", 18);
        Aluno aluno3 = new Aluno("Zoro", 17);
        Aluno aluno4 = new Aluno("Sanji", 20);
        Aluno[] alunosSeminarioC = {aluno1, aluno2};
        Aluno[] alunosSeminarioA = {aluno3, aluno4};
        Professor professor = new Professor("Barba Branca", "Pirata");
        Seminario seminario1 = new Seminario("Cene", alunosSeminarioC, local1);
        System.out.println();
        Seminario seminario2 = new Seminario("Adelaide", alunosSeminarioA, local2);
        Seminario[] seminariosDisponiveis = {seminario1, seminario2};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
