/*
 * "
 * "
 */
package eva2_1_lista_simple;

/**
 * @author Usuario
 */
public class Nodo {

    private int valor;
    private Nodo siguiente;
    
    /*Por default, un nuevo nodo va al final de la lista
      El final de la lista se indica con null
      Por eso */
    public Nodo() {
        this.siguiente = null; 
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
     
    
}
