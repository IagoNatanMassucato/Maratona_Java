package MaratonaJava.Fase3.ObjArray;

public class Anime {
    private String nome;
    private  int[] episodios;

    public Anime(String nome){
        this.nome = nome;
        System.out.println(nome);

        episodios = new int [20];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
        System.out.println("Lista de Episodios");
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
        System.out.println();

    }

}
