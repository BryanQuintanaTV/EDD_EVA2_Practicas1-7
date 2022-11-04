/*
 * "
 * "
 */
package eva2_3_lista_doble;

/**
 * @author Bryan Alexis Quintana Juarez
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int cont;

    //Por default, la lista está vacía
    public ListaDoble() {
        this.inicio = null; //No hay nodos en la lista.
        this.fin = null;
        this.cont = 0;
    }
    
    public boolean listaVacia(){
        if(inicio == null)
           return true;
        else
            return false;
    }
    
    public void imprimir(){
        if(listaVacia())
            System.out.println("La lista está vacía.");
        else{
            Nodo temp = inicio;
            while(temp != null){ //Moverse mientras el siguiente sea distinto de null
                System.out.print(temp.getValor() + " - ");
                    temp = temp.getSiguiente();
            }
        }
    }
    
    public int tamaLista(){
        return this.cont;
    }
    
    //Agregar un nodo al final de la lista
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        //Verificar si hay nodos en la lista
        if(inicio == null){ //No hay nodos en la lista.
            inicio = nuevoNodo; 
            fin = nuevoNodo;
        }else{ //Hay nodos en la lista.
            //Hay que moverse por la lista
            //Usando un nodo tewmporal hasta el último nodo de la lista.
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    public void vaciarLista(){
        inicio = null;
        fin = null;
        cont = 0;
    }
    
    public int obtenerValorEn(int pos) throws Exception{
            int cantNodos = tamaLista();
            int valor = 0;
        //Posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            if(pos == 0){ //Insetar al inicio de la lista
                inicio = inicio.getSiguiente();
            }else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < pos){
                     temp = temp.getSiguiente();
                     cont++;
                }
                valor = temp.getValor();
            }
        }
            return valor;
    }
    
    public void insertarEn(int valor, int pos) throws Exception{
        int cantNodos = tamaLista();
        //Insertar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posición negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            Nodo nuevoNodo = new Nodo(valor);
            if(pos == 0){ //Insetar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            }else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < pos){
                     temp = temp.getSiguiente();
                     cont++;
                }//Hacer reconexión
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
                System.out.println("");
            }
        }
        this.cont++;
    }
    
    public void borrarEn(int pos) throws Exception{
            int cantNodos = tamaLista();
        //Borrar en una posición no válida
        //Posiciones negativas
        //Posiciones mayores a la cantidad de elementos
        if(pos < 0) //Posiciones negativas
            throw new Exception("No puede borrarse un nodo en una posición negativa");
        else if(pos >= cantNodos)//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " no es una posición valida en la lista");
        else{
            //Borrar primer nodo
            //Borrar el intermedio
            //Borrar el final
            if(pos == 0){ //Insertar al inicio de la lista
                inicio = inicio.getSiguiente();
            }else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont <= pos){
                     temp = temp.getSiguiente();
                     cont++;
                }
                Nodo objSig = temp.getSiguiente();
                temp.setSiguiente(objSig.getSiguiente());
                //Hacer reconexión
                if (pos == (cantNodos - 1)) {//Reconectar fin
                        fin = temp;
               }
            }
        }
        this.cont--;
    }   
}