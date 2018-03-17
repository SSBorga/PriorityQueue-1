/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuemanager;

/**
 *
 * @author sudhi
 * @param <T>
 */


/**
 *
 * @author sudhi
 */
public class SortedLinkedPriorityQueue<T> extends  ListNode implements PriorityQueue<T>  {
    
     private ListNode<T> top;

    public SortedLinkedPriorityQueue(ListNode<T> top, ListNode nextNode, PriorityItem item) {
        super(nextNode, item);
        this.top = top;
    }

    
 @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    @Override
    public T head() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return top.getItem();
    }
    
    @Override
    public void add(PriorityItem<T> item) {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
      
    }
    
    @Override
    public void remove(PriorityItem<T> item) {
        for (int i = 0; i < 10; i++) {
            while (it.hasNext()) {
                Object next = it.next();
                top = new ListNode<>(item);
            }
        }
    }
    
    @Override
    public String toString() {
        String result = "LinkedStack: size = " + size();
        result += ", contents = [";
        for (ListNode<T> node = top; node != null; node = node.getNextNode()) {
            if (node != top) {
                result += ", ";
            }
            result += node.getItem();
        }
        result += "], isEmpty() = " + isEmpty();
        if (!isEmpty()) {
            result += ", top() = " + top();
        }
        return result;
    }
    
    
}

