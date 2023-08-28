
package queue;

/**
 *
 * @author Tomás Chiriví
 */
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> miPila = new Queue<String>();
        miPila.enqueue("Maria");
        miPila.enqueue("Juan");
        miPila.enqueue("Pedro");
        for (String elem : miPila) {
            System.out.println(elem);
        }

        //miPila.showStack();
        
        System.out.println("retiro " + miPila.dequeue());
        for (String elem : miPila) {
            System.out.println(elem);
        }
        
    }
    
}
