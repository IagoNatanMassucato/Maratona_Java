package MaratonaJava.Fase1.Arrays;

public class Indice {

    public void PerssonagensV() {
        String[] listaV = new String[5];
        listaV[0] = "Naruto";
        listaV[1] = "Kakashi";
        listaV[2] = "Itachi";
        listaV[3] = "Madara";
        listaV[4] = "Saski";
        for (int i = 0; i < listaV.length; i++){
            System.out.println(listaV[i]);
        }
    }
    public void PerssonagensM(){
        String[][] listaM = new String[5][2];
        listaM[0][0] = "Naruto";
        listaM[0][1] = "Vento";

        listaM[1][0] = "Kakashi";
        listaM[1][1] = "Raio";

        listaM[2][0] = "Itachi";
        listaM[2][1] = "Fogo";

        listaM[3][0] = "Madara";
        listaM[3][1] = "Fogo";

        listaM[4][0] = "Saski";
        listaM[4][1] = "Raio";

        /*
        for (int b = 0; b < listaM.length; b++){
            for (int j = 0; j < listaM[0].length; j++){
                System.out.println(listaM[b][j]);
            }
        }
         */

        System.out.println(listaM[0][0]+"  |  "+listaM[0][1]);
        System.out.println(listaM[1][0]+" |  "+listaM[1][1]);
        System.out.println(listaM[2][0]+"  |  "+listaM[2][1]);
        System.out.println(listaM[3][0]+"  |  "+listaM[3][1]);
        System.out.println(listaM[4][0]+"   |  "+listaM[4][1]);
    }

}
