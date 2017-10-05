/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author franc
 * @param <T>
 */
public class Stack <T> {
    
    //Atributos
    
    private Node<T> top;
    private int size;
    
    //Constructores
    public Stack() {
        this.top = null;
        this.size = 0;
    }
    
    public Stack(T d) {
        Node <T> node = new Node(d);
        this.top = node;
        this.size = 1;
    }

    //Regresa el tamaño de la pila
    public int getSize() {
        return size;
    }
    
    //Ingresa dato a la pila
    public void push(T d){
        Node <T> node = new Node(d);
        node.next = top;
        top = node;
        size++;
    }
    
    //Retira el dato de top de la pila
    public T pop(){
        if (size>0) {
		T d = top.data;
		top = top.next;
		size--;
		return d;
	}
	else {
		return null;
	}
    }

    //Regresa el valor de top
    public T getTop() {
        if (size > 0) {
		return top.data;
	}
	else {
		return null;
	}
    }
    
    //Muestra la pila
    public void showStack(){
        Node<T> t = top;
	while(t!=null) {
            System.out.println(t);
		t = t.next;
	}
	       System.out.println("NULL");
    }
    
}
