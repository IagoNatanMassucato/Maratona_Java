package MaratonaJava.Fase4.SuperClass;

public abstract class Automovel {
    private static String nome;
    private static String marca;
    private static String modelo;
    private static String dataF;

    public Automovel(String nome, String marca, String modelo, String dataF) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.dataF = dataF;
    }
    public void infAutomovel(){
        System.out.println("Nome => "+this.nome);
        System.out.println("Marca => "+this.marca);
        System.out.println("Modelo => "+this.modelo);
        System.out.println("Data de Fabricação => "+this.dataF);
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Automovel.nome = nome;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Automovel.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Automovel.modelo = modelo;
    }

    public static String getDataF() {
        return dataF;
    }

    public static void setDataF(String dataF) {
        Automovel.dataF = dataF;
    }
}
