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
public class EDList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyList <String> Lista = new MyList();
        Lista.insertFirst("100");
        Lista.showList();
        Lista.insertLast("50");
        Lista.showList();
        Lista.insertFirst("30");
        Lista.showList();
        Lista.deleteNode("50");
        //Lista.deleteLast();
        Lista.showList();
              
    }
    
}
