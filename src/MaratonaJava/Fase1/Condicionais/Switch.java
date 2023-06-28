package MaratonaJava.Fase1.Condicionais;

public class Switch {
    public char sexo;
    public Switch(char sexo) {
        this.sexo = sexo;
    }

    public void cnfSexo(){

        switch (sexo) {
            case 'M':
                System.out.println("Sexo => Homem");
                break;
            case 'F':
                System.out.println("Sexo => Mulher");
            default:
            System.out.println("Sexo => Inválido");
            break;
        }
    }

}
