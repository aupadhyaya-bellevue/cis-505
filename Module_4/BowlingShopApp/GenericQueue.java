/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.util.LinkedList;

public class GenericQueue<E> {
    // Private generic list to hold products 
    private LinkedList<E> list = new LinkedList<>();

    /**
     * Method to add a new product to the queue
     * @param item
     */
    public void enqueue(E item) {
        list.addFirst(item);
    }

    /**
     * Method to remove last item from the queue
     * @return
     */
    public E dequeue() {
        return list.removeFirst();
    }

    /**
     * Method to return size of the queue
     * @return size int
     */
    public int size() {
        return list.size();
    }
}
