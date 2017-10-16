/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author franc
 */
public class Deque<T> {
    
    private NodeDL<T> front;
    private NodeDL<T> rear;
    private int size;
    
    Deque(){
        front = null;
	rear = null;
	size = 0;
    }
    Deque(T d){
        NodeDL node = new NodeDL(d);
        front = rear;
        rear = node;
        size = 1;
    }
    
    public void enqueueFront(T d){
        NodeDL node = new NodeDL(d);
	if (isEmpty()) {
            front = rear;
            rear = node;
        }else{
            node.next = front;
            front.prev = node;
            front = node;
        }
	size++;
    }
    
    public void enqueueRear(T d){
        if (isEmpty()) {
            enqueueFront(d);
        }else{
            NodeDL node = new NodeDL(d);
            rear.next = node;
            node.prev = rear;
            rear = node;
            size ++;
        }
}
    
    public T dequeueFront(){
        if (!isEmpty()) {
            NodeDL<T> fd = front;
            if(size == 1){
                clearDeque();
            }else{
                front = front.next;
                front.prev = null;
                fd.next = null;
                size--;
            }
            return fd.data;
	}else{
            return null;
        }
    }
    
    public T dequeueRear(){
        if (!isEmpty()) {
            NodeDL<T> rd = rear;
            if(size == 1){
                clearDeque();
            }else{
                rear = rear.next;
                rear.prev = null;
                rd.prev = null;
                size--;
            }
            return rd.data;
        }else{
            return null;
        }
    }
    
    public T getFront(){
        return front.data;
    }
    
    public T getRear(){
        return rear.data;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void clearDeque(){
        front = rear;
        rear = null;
        size = 0;
    }
    
    public void showDeque(){
        System.out.print("front->"); 
        NodeDL<T> p =front;
        if(p==null){
            System.out.print("null");
        }
        while(p!=null){
            p.print();
            p=p.next;
        }
        System.out.println("<-rear");
}
}