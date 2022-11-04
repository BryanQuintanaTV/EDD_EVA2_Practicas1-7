/*
 * "
 * "
 */
package eva2_6_arbol_binario;

/**
 *
 * @author Usuario
 */
public class EVA2_6_ARBOL_BINARIO {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.agregar(13);
        arbol.agregar(10);
        arbol.agregar(18);
        arbol.agregar(2);
        arbol.agregar(11);
        arbol.agregar(17);
        arbol.agregar(20);
        arbol.agregar(16);
        arbol.agregar(16);
        
        arbol.inOrder();
        arbol.preOrder();
        arbol.postOrder();
    }
    
}
