package MaratonaJava.Fase4.Extends;

import MaratonaJava.Fase4.SuperClass.Automovel;

public class Carro extends Automovel {

    public final int velocidadeM;

    public Carro(String nome, String marca, String modelo, String dataF, int velocidadeM) {
        super(nome, marca, modelo, dataF);
        this.velocidadeM = velocidadeM;
    }

    @Override
    public void infAutomovel() {
        super.infAutomovel();
        System.out.println("Velocidade Máxima => "+this.velocidadeM+"Km");
    }
}
