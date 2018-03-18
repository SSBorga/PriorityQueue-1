package queuemanager;

import static java.awt.AWTEventMulticaster.add;

/**
 * Implementation of the PriorityQueue ADT using a sorted array for storage.
 *
 * The sorted array priority queue adds items with the highest priority
 * at the start of the array. The item at the start of the array is always
 * the first to be removed.
 * 
 * @param <T> The type of things being stored.
 */
public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T> {

    private int size;     // size of the stack
    private Node top;     // top of stack
    
    // helper linked list class
    private class Node {
        private T item;
        private Node nextNode;
        private int priority;

        public Node(T item, int priority) {
            this.item = item;
            this.priority = priority;
        }

        public Node(T item, Node nextNode, int priority) {
            this.item = item;
            this.nextNode = nextNode;
            this.priority = priority;
        }

        public Node(int priority) {
            this.priority = priority;
        }
         public Node() {
        }
        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

         public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

       
@Override
public String toString(){
    return "Item:"+this.getNextNode();
} 

  
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }
   

   // private item<T> top;

    /**
     * Create a new empty queue of the given size.
     */
    public SortedLinkedPriorityQueue() {
        top = null;
        size = 0;
    }

    /**
     * Return the highest priority item in the queue.
     * 
     * @return item
     */
    @Override
    public T head() throws QueueUnderflowException {
        return null;
    }

    /**
     * Add a new item to the queue.
     *
     * @param item
     * @param priority
     */
    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        
        if (top == null) {
        
            System.out.println("Inserting first node");
   Node newNode; 
            newNode = new Node();
    newNode.setNextNode(this.top);
    this.top = newNode;
    
       // System.out.println(add.toString(newNode));
        System.out.println("Inserting further node"+newNode);
//        }
       
            
 //top = new Node();
        //   top.item = item;
       //  top.priority = priority;
       //   top.next = null;
// // } else {
//     /**      for (int i = 0; i <12; i++){ 
//        Node next = top;
//         Node prev = next;}
//          
//      while (Node  = top; node != null; node = node.next) {
//if (priority > node.priority) {*/
//                  break;
//                }
//             prev = next;
//              next = next.getNext();
////                
//            }
            
           
        
            /*
                if (priority > node.priority) {
                    
                    System.out.println("This node is a higher priority");
                    
                    Node oldfirst = top;
                    top = new Node();
                    top.item = item;
                    top.priority = priority;
                    top.next = oldfirst;
                    
                    System.out.println("oldfirst:" + oldfirst);
                } else {
                
                    System.out.println("This node is a lower priority");
                    
                    
                }
            } */
        }
    }
      //  size++;
   // }

    /**
     * Remove an item from the queue.
     */
    @Override
    public void remove() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T item = top.item;        // save item to return
            top = top.nextNode;            // delete first node
            size--;
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
  //https://stackoverflow.com/questions/29140402/how-do-i-print-my-java-object-without-getting-sometype2f92e0f4/29140403#29140403
    
  /**  @Override
     public String toString() {
        String result = "LinkedList:  " ;
        result += ", ";
        for (Node node = top; node != null; node = node.getNextNode()) {
            if (node != top) {
                result += ", "+ top.getNextNode();
            }
            result += node.getNextNode();
        }
        result += "], isEmpty() = " + isEmpty();
        if (!isEmpty()) {
            result += ", top() = " + top;
        }
        return result;
    }*/
    @Override 
   public String toString() {
       String result = "{";
        Node current =this.top;
       while(current !=null)
       {
               result = result +=current.toString()+ ", ";
                current =current.getNextNode();
           }
           
      
       result += "}";
      return result;
    }
}

