/*
 * "
 * "
 */
package eva2_4_queue;

/**
 *
 * @author Usuario
 */
public class EVA2_4_QUEUE {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        //FIFO --> FIRST IN, FIRST OUT
        myQueue.agregar(10); //Primero en llegar, primero en ser atendido
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);
        myQueue.agregar(50); //último en llegar, útlimo en ser atendido

        System.out.println("Primer valor en llegar es: " + myQueue.peek());
        myQueue.imprimir();

        try {
            System.out.println("Primer valor en llegar es: " + myQueue.poll());
        } catch (Exception e) {
        }

        myQueue.imprimir();
    }

}
