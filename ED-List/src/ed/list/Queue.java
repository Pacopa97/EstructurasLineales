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
public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;
    
    public Queue(){
        front = rear;
        rear = null;
        size = 0;
    }
    
    public Queue(T d){
        Node<T> node = new Node<T>(d);
        front = rear;
        rear = node;
        size = 1;
    }
    
    public void enqueue(T d){
        Node<T> node = new Node<T>(d);
        if(isEmpty()){
            front = rear;
            rear = node;
            size = 1;
        }else{
          rear.next = node;
          rear = node;
          size++;
        } 
    }
    
    public T dequeue(){
        if(isEmpty()){
            return null;
        }else{
            Node<T> fd = front;
            front = front.next;
            size--;
            return fd.data;
        }
    }
    
    public T getFront(){
        if(isEmpty()){
            return null;
        }else{
            return front.data;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public void clearQueue(){
        front = rear;
        rear = null;
        size = 0;
    }
    
    public void showQueue(){
        System.out.println("front->");
        Node<T> p = front;
        if(p==null){
            System.out.println("null");
        }
        while(p!=null){
            p.print();
            p = p.next;
        }
        System.out.println("<-rear");
    }
    
    
}
