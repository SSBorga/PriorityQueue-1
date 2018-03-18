package queuemanager;

/**
 * Implementation of the PriorityQueue ADT using a sorted linked list
 * for storage.
 *
 * The sorted linked list priority queue adds items with the highest priority
 * at the first position in the queue. The item at the top of the queue
 * is always the first to be removed.
 * 
 * @param <T> The type of things being stored.
 */
public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    /**
     * The bundled priority item object.
     */
    private ListNode<T> top;
   
   

    /**
     * Initialise the first item with a null pointer.
     */
    public SortedLinkedPriorityQueue() {
        top = null;
    }

    /**
     * Return the highest priority item in the queue.
     * 
     * @return item
     */
   

    /**
     * Add a new item to the queue.
     *
     * @param item
     * @param priority
     */
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
       PriorityItem newPriority = new PriorityItem(item, priority);
       top = new ListNode<>(newPriority,top);

     /**   if (top == null) {
            top = ListNode;
           ListNode = null;
        } else {
            PriorityItem next = top;
            PriorityItem prev = next;

            while (next != null) {
                if (priority > next.getPriority()) {
                    // stop iteratng and insert
                    break;
                }
                prev = next;
                next = next.getNext();
            }

            node.setNext(next);
            if (node.getPriority() > top.getPriority()) {
                top = node;
            } else {
                prev.setNext(node);
            }
        }*/
    }
 @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
          //  return new ListNode<>(newPriority,top).getItem();
            
                return top.getItem().getItem();
            }
        }
   

    /**
     * Remove the first item from the queue.
     */
    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            top = top.getNext();
        }
    }

    /**
     * Check if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Return the contents of the queue.
     * 
     * @return result
     */
    @Override
    public String toString() {
        String result = "LinkedList: size = " ;
        result += ", contents = [";
        for (ListNode<T> newPriority = top; newPriority != null; newPriority = newPriority.getNext()) {
            if (newPriority != top) {
                result += ", ";
            }
            result += newPriority.getItem();
        }
      /**  result += "], isEmpty() = " + isEmpty();
        if (!isEmpty()) {
            result += ", top() = " + top;
        }*/
        return result;
    }
}
