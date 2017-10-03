/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author franc
 * @param <T> //Netbeans needed
 */
public class MyCList <T> {
     Node pivot;
     Node pointer;
     int length;
    
     //Constructores
    
    MyCList(){
        this.pivot=null;
        this.pointer=null;
        this.length=0;
    }
    
    MyCList(T d){
        Node node = new Node(d);
        pivot=node.next=node;
        length++;
    }
    
    //Comprueba si esta vacia la lista
    public boolean isEmpty(){
        return length == 0;
    }
    
    
    //Inserta nodo a la lista
    public void insert(T d){
        Node node = new Node(d);
        if(isEmpty()){
            pivot=node.next=node;
        }else{
            node.next=pivot.next;
            pivot.next=node;
        }
        length++;
    }
    
    //Borra un nodo en especifico
    public void deleteNode(T d){
        if(!isEmpty()){//Comprueba si hay elementos
            pointer = pivot;
            for(int i = 1; i<=length;i++){
                if(pointer.next.data == d){
                    pointer.next = pointer.next.next;
                    if(pivot.data == d){
                        pivot=pointer;
                    }
                    length--;
                    pointer=null;
                    i=length+1;
                }
                pointer=pointer.next;
            }
        }
        
    }
    
    //Borrar toda la lista
    public void deleteList(){
        pivot = pointer = null;
    }
    
    //Muestra la lista
    public void showList(){
        pointer = pivot;
        System.out.print("first->");
        for(int i = 0; i<length ; i++){
            System.out.print("[" + pointer.data.toString() + "]->");
            pointer = pointer.next;
        }
        System.out.println("<-last");
    }
    
}
