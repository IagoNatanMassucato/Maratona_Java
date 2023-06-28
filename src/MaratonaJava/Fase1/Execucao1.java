package MaratonaJava.Fase1;
import MaratonaJava.Fase1.Metodos.Operadores;
import MaratonaJava.Fase1.Repeticao.Loops;
import MaratonaJava.Fase1.TiposVariaveis.Variaveis;
import MaratonaJava.Fase1.Condicionais.If;
import MaratonaJava.Fase1.Condicionais.Switch;
import MaratonaJava.Fase1.Arrays.Indice;

public class Execucao1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("   Projeto Maratona Java");
        System.out.println("1º Fase");
        Variaveis dados = new Variaveis();
        dados.InfDadosPrimitivos();
        System.out.println("-------------------------");

        System.out.println("Métodos VOID, PARAMETRO, RETORNO, STATIC");
        Operadores opr = new Operadores();
        opr.infOperadores();
        int restSm = opr.somaDoisNm(5,25);
        System.out.println("Soma dois números => "+restSm);
        int restSb = opr.subtrairDoisNm(20,5);
        System.out.println("Subtrai dois números => "+restSb);
        double restDiv = opr.divideDoisNm(9,5);
        System.out.println("Divide dois números => "+restDiv);
        opr.metodoStatic();
        System.out.println("-------------------------");

        System.out.println("Métodos Condicionais IF e SWITCH");
        If is = new If ("Iago Massucato", 19);
        is.acessoVoto();
        Switch confirma = new Switch('M');
        confirma.cnfSexo();
        System.out.println("-------------------------");
        System.out.println("LOOPS FOR");
        Loops lFor = new Loops();
        lFor.imprimeNumFor();
        System.out.println("-------------------------");
        System.out.println("LOOPS WHITE");
        lFor.imprimeNumWhile();
        System.out.println("-------------------------");
        System.out.println("LOOPS DO WHITE");
        lFor.imprimeNumDoWhile();
        System.out.println("-------------------------");
        System.out.println("Array VETOR");
        Indice vetor = new Indice();
        vetor.PerssonagensV();
        System.out.println("-------------------------");
        System.out.println("Array MATRIZ");
        vetor.PerssonagensM();
        System.out.println("-------------------------");



    }
}
