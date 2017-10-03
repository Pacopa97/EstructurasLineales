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
public class NodeDL <T>{
    T data;
    NodeDL next;
    NodeDL prev;
    
    //Double Linked Node
    NodeDL(T d){
        this.data = d;
        this.next = null;
        this.prev = null;
    }
    
}
