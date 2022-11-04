/*
 * "
 * "
 */
package eva2_6_arbol_binario;

/**
 *
 * @author Usuario
 */
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }

    //Método público para el usuario
    public void agregar(int valor) {
        //1 Que el nodo recibido es null
        //Árbol vacío
        if (root == null) {
            root = new Nodo(valor);
        } else {
            agregarRecur(valor, root);
        }
    }

    //Método recursivo agregar
    //Necesita el valor y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual) {

        //2 Decidir si va a la izq. o der.
        /*
            Verificar si el lado (nodo) es null
                sí es null, ahí va el valor 
            si no
                Repetir recursión
         */
        Nodo nuevo = new Nodo(valor);

        if (valor < nodoActual.getValor()) { //Va a la izq

            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getIzquierda());
            }

        } else if (valor > nodoActual.getValor()) { //Va a la der

            if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(nuevo);
            } else {
                agregarRecur(valor, nodoActual.getDerecha());
            }

        } else { //Igual
            System.out.println("¡ELEMENTO REPETIDO!");
        }
    }
    //Impresion de valores:
    //In-order
    //Izq valor der
    //Método público

    public void inOrder() {
        inOrderRecu(root);
        System.out.println("");
    }

    //Método privado recursivo
    private void inOrderRecu(Nodo nodo) {
        if (nodo != null) {
            inOrderRecu(nodo.getIzquierda());
            System.out.print(nodo.getValor() + " - ");
            inOrderRecu(nodo.getDerecha());
        }
    }

    public void preOrder() {
        preOrderRecu(root);
        System.out.println("");
    }

    //Método privado recursivo
    private void preOrderRecu(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.getValor() + " - ");
            preOrderRecu(nodo.getIzquierda());
            preOrderRecu(nodo.getDerecha());
        }
    }

    public void postOrder() {
        postOrderRecu(root);
        System.out.println("");
    }

    //Método privado recursivo
    private void postOrderRecu(Nodo nodo) {
        if (nodo != null) {
            postOrderRecu(nodo.getIzquierda());
            postOrderRecu(nodo.getDerecha());
            System.out.print(nodo.getValor() + " - "); 
        }
    }

    //¿Cómo borramos nodos?
}
