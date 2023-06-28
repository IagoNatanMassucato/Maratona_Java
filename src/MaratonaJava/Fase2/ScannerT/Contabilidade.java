package MaratonaJava.Fase2.ScannerT;
import java.util.Scanner;

public class Contabilidade {
    public String nome;
    public long cpf;
    public  int npis;
    public double aumento;
    public double salario;
    public double fixo;

    Scanner sc = new Scanner(System.in);
    public void Contagem(){
        System.out.print("Digite o nome => ");
        nome = sc.nextLine();
        System.out.print("Digite o CPF => ");
        cpf = sc.nextLong();
        System.out.print("Digite o Nº PIS => ");
        npis = sc.nextInt();
        System.out.print("Digite o sálario fixo => ");
        fixo = sc.nextDouble();
        System.out.print("Digite o aumento de sálario => ");
        aumento = sc.nextDouble();
        System.out.println("-------------------------------");

        aumento = aumento * fixo / 100;

        salario = aumento + fixo;
        System.out.println("Nome => "+nome);
        System.out.println("CPF => "+cpf);
        System.out.println("Nº PIS "+npis);
        System.out.println("Seu sálario atual é => "+salario);
    }


}
