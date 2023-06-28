package MaratonaJava.Fase4.Extends;

import MaratonaJava.Fase4.Enum.TipoCliente;
import MaratonaJava.Fase4.Enum.TipoPagamento;
import MaratonaJava.Fase4.SuperClass.Pessoa;

public class Cliente extends Pessoa {
  private TipoCliente tipoCliente;
  private TipoPagamento tipoPagamento;

  public Cliente(String nome, long rg, long cpf, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
    super(nome, rg, cpf);
    this.tipoCliente = tipoCliente;
    this.tipoPagamento = tipoPagamento;
  }

  @Override
  public void infPessoa() {
    super.infPessoa();
    System.out.println("Tipo de Cliente =>"+this.tipoCliente);
    System.out.println("Forma de Pagamentos => "+this.tipoPagamento);
  }
}
