/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.fpineiroa.t02;

/**
 *
 * @author franc
 * @param <T>
 */

public class Node <T> {
    T data;
    Node next;
    
    
   Node(T d){
       this.data = d;
       this.next=null;
   }
}

