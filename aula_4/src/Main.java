import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[]  lista= {1,2,3,4,5,6,7,8,9,10};

        //repetir(lista,0); para incrementar
        //repetir(lista,9); para decrementar

        /*for(int numero : lista) {
            System.out.println(numero);
        }*/
        List<String> outraLista = List.of("A", "B", "C", "D");
        outraLista.forEach(item -> {

            System.out.println(item);
        });

    }
   /* public static void repetir (int[] lista, int numeroDeRepeticao) {

        if (lista.length > numeroDeRepeticao) {
            System.out.println(lista[numeroDeRepeticao]);
            numeroDeRepeticao++;
            repetir(lista, numeroDeRepeticao);

            //repetir(lista, ++numeroDeRepeticao);
        }
    } */

    /* public static void repetir (int[] lista, int numeroDeRepeticao) {
          if(0 <= numeroDeRepeticao) {
              System.out.println(lista[numeroDeRepeticao]);
              numeroDeRepeticao--;
              repetir(lista, numeroDeRepeticao);

             //repetir(lista, ++numeroDeRepeticao);
         }
     }*/

}
