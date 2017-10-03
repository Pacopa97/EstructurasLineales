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

public class MyDLList <T> {
    NodeDL first;
    NodeDL last;
    NodeDL pointer;
    int length;
    
    //Constructor
    MyDLList(){
        this.first = null;
        this.last = null;
        this.pointer = null;
        length = 0;
    }
    //Constructor con un primer nodo
    MyDLList(T d){
        NodeDL node = new NodeDL(d);
        //Apuntamos primero y ultimo al nuevo nodo
        this.first = node;
        this.last = node;
        pointer = null;
        length = 1;
    }
    
    //Comprueba si la lista esta vacia
    public boolean isEmpty(){
        return length == 0;
    }
    //Insertar al inicio
    //Escenarios: Lista vacia, lista con elementos
    public void insertFirst(T d){
        NodeDL node = new NodeDL(d);
        if(isEmpty()){//Si la lista esta vacia
            this.first = node;
            this.last = node;
        }else{//Si la lista ya cuenta con elementos
	//El siguiente del nuevo nodo apunta al nodo que apunta first
            node.next = first;
        //El nodo que apunta first en su apuntador back apuntara al nuevo nodo
            first.prev = node;
        //El apuntador first apunta al nuevo nodo
            first = node;
        }
        length+=1;
    }
    
    //Insterta un nodo al final
    public void insertLast(T d){
        NodeDL node = new NodeDL(d);
        if(!isEmpty()){
            last.next = node;
            node.prev = last;
            last = node;
        }else{
            first = node;
            last = node;
        }
        length+=1;
    }
    
    //Elimina el primer nodo
    public void deleteFirst(){
        if(!isEmpty()){
            first.next.prev=null;
            first=first.next;
            length-=1;
        }
    }
    
    //Elimina el ultimo nodo
    public void deleteLast(){
        if(!isEmpty()){
            last=last.prev;
            last.next=null;
            length-=1;
        }
    }
    
    //Elimina un nodo en especifico
    public void deleteNode(T data){
        if(!isEmpty()){
            if(first.data == data){
                deleteFirst();
                length-=1;
            }
            if(last.data==data){
                deleteLast();
                length-=1;
            }
            pointer=first;
            do{
                if(pointer.data==data){
                    pointer.prev.next=pointer.next;
                    pointer.next.prev=pointer.prev;
                    pointer = null;
                    length-=1;
                }else{
                    pointer=pointer.next;
                }
            }while(pointer!=null);
        }
    }
    
    //Se muestra la lista de inicio a fin
    public void showListFirstLast(){
        if(!isEmpty()){
            pointer=first;
            System.out.print("First->");
            while(pointer!=null){
                System.out.print("[" + pointer.data + "]");
                pointer=pointer.next;
                if(pointer!=null){
                    System.out.print("->");
                }
            }
            System.out.print("<-Last");
        }
    }
    
    //Se muestra la lista de fin a inicio
    public void showListLastFirst(){
        if(!isEmpty()){
            pointer=last;
            System.out.print("Last->");
            while(pointer!=null){
                System.out.print("[" + pointer.data + "]");
                pointer=pointer.prev;
                if(pointer!=null){
                    System.out.print("->");
                }
            }
            System.out.print("<-First");
        }
    }
    
}
