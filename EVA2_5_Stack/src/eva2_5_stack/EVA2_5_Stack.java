/*
 * "
 * "
 */
package eva2_5_stack;

/**
 *
 * @author Usuario
 */
public class EVA2_5_Stack {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.imprimir();
        System.out.println("La cima de la pila : "+myStack.peek());
        myStack.imprimir();
        try {
            System.out.println("La cima de la pila : "+myStack.pop());            
        } catch (Exception e) {

        }
        myStack.imprimir();
    }

}
