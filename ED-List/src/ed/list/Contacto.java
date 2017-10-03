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
public class Contacto {
    String nombre;
    String telefono;
    
    Contacto(){
        this.nombre = "hola";
        this.telefono = "adios";
    }
    
  @Override
  public String toString(){
      return this.nombre + "" + this.telefono;
  }
    
}
