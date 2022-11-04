/*
 * "
 * "
 */
package javaapplication34;

import java.util.LinkedList;

/**
 *
 * @author Bryan Alexis Quintana Juarez
 */
public class EVA2_2_TIPOS_DATOS_GENERICOS {

    public static void main(String[] args) {
        LinkedList<String> miLista = new LinkedList<String>();
        //miLista.
        TiposDatosGenericos<String> miObj = new TiposDatosGenericos<String>();
        System.out.println(miObj.getValor());

    }

}

class TiposDatosGenericos<T> {

    private T valor;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

}
