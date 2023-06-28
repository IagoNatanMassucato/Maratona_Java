package MaratonaJava.Fase4.Extends;

import MaratonaJava.Fase4.SuperClass.Pessoa;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, long rg, long cpf, String funcao, String especialidade, String dataT) {
        super(nome, rg, cpf);
        this.funcao = funcao;
        this.especialidade = especialidade;
        this.dataT = dataT;
    }

    @Override
    public void infPessoa() {
        super.infPessoa();
        System.out.println("Função => "+this.funcao);
        System.out.println("Especialidade => "+this.especialidade);
        System.out.println("Data de Trabalho => "+this.dataT);
        System.out.println();
    }

    private String funcao;
    private String especialidade;

    private String dataT;

    public String getDataT() {
        return dataT;
    }

    public void setDataT(String dataT) {
        this.dataT = dataT;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
