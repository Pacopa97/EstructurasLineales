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
public class MyList <T> {
    Node first;
    Node last;
    Node pointer;
    int length;
    
   //Constructor 
    MyList(){
        first = null;
        last = null;
        pointer = null;
        length=0;
    }
    
    MyList(T d){
        Node node = new Node(d);
        first = node;
        last = node;
        node.next=null;
        length++;
    }
    
    public boolean isEmpty(){
        return first==null;
    }
    
    public void insertFirst(T d){
        //Se crea el nodo y despues se comprueba si eta vacio
        Node node = new Node(d);
        
        if(isEmpty()){ //Caso: lista vacia
            first = node;
            last = node;
            node.next=null;
        }else{ //Caso: lista con elementos
            node.next = first;
            first = node;
        }
        length++;
    }
    
    public void insertLast(T d){
        Node node = new Node(d);
         if(isEmpty()){ //Caso: lista vacia
            first = node;
        last = node;
        node.next=null; 
        }else{ //Caso: lista con elementos
            last.next = node;
            last = node;
        }
          length++;
    }
    
   
    //Eliminar al inicio
    
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next == null){ //Si la lista solo tiene un elemento
                first = null;
                last = null;
                
            }else{ //Si la lista tiene mas de un elemento
                first = first.next;
            }
        }
        length--;
    
}
    
    //Eliminar al final
    public void deleteLast(){
        if(!isEmpty()){
            if(first==last){ //Si la lista solo tiene un elemento
                first=last=null;
                
            }else{ //Buscamos dentro del arreglo
                pointer = first;
                while(pointer.next!=last){ //Recorre la lista hasta el penultimo elemento
                    pointer=pointer.next;
                }
                last = pointer;
                last.next=pointer=null;
            }
        }
        length--;
    }
    
    
    //Eliminar nodo
    public boolean deleteNode(T n){
        Node p = fetchBack(n);
        if(p!=null){ //Si se encuentra el elemento
        if(p.data==n){ //Si fue el primero o unico elemento de la lista
           deleteFirst(); 
        } /*if(p.data==n){
         deleteLast();
         }*/
        else{ //Si esta dentro de la lista
            p.next= p.next.next;
         }
        length--;
        return true;
            }
        return false;
    }
    
    
    public T fetch(T n){
        //Si no esta vacia la lista
        if(!isEmpty()){
            if(first==last && first.data==n){//Si hay un solo elemento y es el que busco
                return (T) first.data;
            }else{
                pointer = first;
            }
        } return null;
    }
    
    
    
    
    public Node fetchBack (T n){
        pointer=first;
                if(!isEmpty()){
                    if(first==last){ //Si hay un solo elemento
                        if(first.data==n){ //Es el elemento que busco?
                            return first; //Se devuelve a si mismo
                        } else{
                            return null; //En caso de no encontrarlo
                        }
                    }else{ //Si hay mas elementos en la lista
                        if(first.data==n){
                            return first;
                        } /*else if(last.data==n){
                            return last;
                        }*/else{
                        
                            pointer=first;
                            while(pointer.next!=null){
                                if(pointer.next.data==n){
                                return pointer;
                            }
                                pointer=pointer.next;
                            }
                        }
                    }
                }
                return null;
                            }
    
    
    public void showList(){
        pointer=first;
        System.out.print("first->");
        for(int i=0; i<length;i++){
            System.out.print("[" +pointer.data.toString()+"]->");
            pointer=pointer.next;
        }
        System.out.println("<-last");
    }
    }

