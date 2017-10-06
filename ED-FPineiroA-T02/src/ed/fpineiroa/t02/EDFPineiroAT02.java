/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.fpineiroa.t02;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class EDFPineiroAT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      
        
        Stack stack = new Stack();
        System.out.println("----------Palindromos----------");
        System.out.println("Introduzca la palabra: ");
        Scanner teclado = new Scanner(System.in);
        String input = teclado.nextLine().replaceAll(" ","");
        
       char[]arr = input.toCharArray();
        String pal = "";
        
        for(int i=0; i< arr.length ;i++){
            
        stack.push(input.charAt(i));
       
           // System.out.print(input.charAt(i));
           
        }
        while(!stack.isEmpty()){
            pal=pal+stack.pop();
        }
        
        if(input.equals(pal)){
            
            System.out.println("Es un palindromo");
        }else{
            System.out.println("No es un palindromo");
        }
         
      //  System.out.println(input.charAt(1));
        
    }
      
}

    

