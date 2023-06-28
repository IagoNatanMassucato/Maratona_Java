package MaratonaJava.Fase1.Repeticao;

public class Loops {

    public byte num = 10;

        public void imprimeNumFor(){
            for(int i = 0; i < 6; i++){
            System.out.println(i);
            }
        }
        public void  imprimeNumWhile(){
            byte j = 0;
            while (j < 5) {
            j++;
            System.out.println(j);
            }
        }
        public void  imprimeNumDoWhile(){
            int cont = 12;
            while (cont < 10){
                System.out.println(++cont);
            }

            do{
                System.out.println("Mesmo que a condição não seja verdadeira é execultado uma vez !");
            }while (cont < 10);

    }

}
