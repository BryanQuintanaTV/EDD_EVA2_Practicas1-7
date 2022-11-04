/*
 * "
 * "
 */
package eva2_1_lista_simple;

/**
 *
 * @author Usuario
 */
public class EVA2_1_LISTA_SIMPLE {

    public static void main(String[] args) {
        Lista miLista = new Lista();
        //int[] arreglo = new int[1000000];
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.agregar(10); //0
        miLista.agregar(20); //1
        miLista.agregar(30); //2
        miLista.agregar(40); //3 <--
        miLista.agregar(50); //4
        miLista.agregar(60); //5
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());
        miLista.imprimir();

        try {
            miLista.insertarEn(70, 3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        miLista.imprimir();

        try {
            miLista.borrarEn(0);
        } catch (Exception e) {

        }
        System.out.println("Cantidad de nodos: " + miLista.tamaLista());

        // miLista.agregar(80);
        //miLista.imprimir();
        try {
            System.out.println(miLista.obtenValorEn(1));
        } catch (Exception e) {
        }

        /*for (int i = 0; i < 1000000; i++) {  //O(N²)
            miLista.agregar(1000);
        }
        System.out.println("Conteo de nodos: " + miLista.tamaLista());
        //miLista.imprimir();
         */
    }

}
