package MaratonaJava.Fase4;

import MaratonaJava.Fase4.Enum.TipoCliente;
import MaratonaJava.Fase4.Enum.TipoPagamento;
import MaratonaJava.Fase4.Extends.Cliente;
import MaratonaJava.Fase4.Extends.Funcionario;
import MaratonaJava.Fase4.SuperClass.Pessoa;
import MaratonaJava.Fase4.ToString.SobreEscrita;
import MaratonaJava.Fase4.Extends.Carro;

public class Execucao4 {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Pessoas Cadastradas");
        System.out.println();
        Pessoa iago = new Pessoa("Iago", 879463240L, 45621656565L);
        Pessoa rafael = new Pessoa("Rafael", 15432163L, 12457613547L);
        Pessoa lucas = new Pessoa("Lucas", 8245415487L, 18241545945L);
        iago.infPessoa();
        rafael.infPessoa();
        lucas.infPessoa();
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Funcionários Cadastrados");
        System.out.println();
        Funcionario ti = new Funcionario(iago.getNome(), iago.getRg(), iago.getCpf(), "TI", "Informática", "24/08/2022");
        ti.infPessoa();
        Funcionario rh = new Funcionario(rafael.getNome(), rafael.getRg(), rafael.getCpf(), "RH", "Recursos Humanos", "02/06/2020");
        rh.infPessoa();
        Funcionario almoxarifado = new Funcionario(lucas.getNome(), lucas.getRg(), lucas.getCpf(), "Almoxarifado", "Logística", "13/01/2018");
        almoxarifado.infPessoa();
        System.out.println("--------------------------------");
        System.out.println("Clientes Cadastrados");
        System.out.println();
        Cliente cliente1 = new Cliente("Luiz Eduardo", 487968236L, 74618943025L, TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Paulo Luíz", 428740398L, 71048039450L, TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        cliente1.infPessoa();
        cliente2.infPessoa();
        System.out.println("Método toString, sobre escreve o retorno");
        System.out.println();
        SobreEscrita anime = new SobreEscrita("Deaf Not");
        System.out.println(anime);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Váriaveis Constante (Static e final) não muda o Valor");
        System.out.println();
        Carro gol = new Carro("Gol", "Volkswagen", "Quadrado", "11/06/2011", 200);
        gol.infAutomovel();
    }
}