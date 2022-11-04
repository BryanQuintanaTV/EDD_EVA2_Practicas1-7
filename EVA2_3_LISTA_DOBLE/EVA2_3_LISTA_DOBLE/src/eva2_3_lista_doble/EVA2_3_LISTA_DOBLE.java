/*
 * "
 * "
 */
package eva2_3_lista_doble;

/**
 *
 * @author Usuario
 */
public class EVA2_3_LISTA_DOBLE {

    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble();
        
        listaDoble.agregar(10);
        listaDoble.agregar(20);
        listaDoble.agregar(30);
        listaDoble.agregar(40);
        
        listaDoble.imprimir();
        
        try {
            listaDoble.insertarEn(5, 0);
        } catch (Exception e) {
        }
        
        listaDoble.imprimir();
        
        try {
            listaDoble.borrarEn(4);
        } catch (Exception e) {
        }
        listaDoble.imprimir();
    }
    
}
