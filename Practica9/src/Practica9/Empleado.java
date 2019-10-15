/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica9;

/**
 *
 * @author poo02alu18
 */
public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String nss;
public Empleado(String nombre,String apellido,String nss){
    this.nombre=nombre;
    this.apellido=apellido;
    this.nss=nss;
}
public void setNombre(){
    this.nombre = nombre;
}
public void setApellido(){
    this.apellido=apellido;
}
public void setNss(){
    this.nss=nss;
}
public String getNombre(){
    return this.nombre;
}
public String getApellido(){
    return this.apellido;
}
public String getNss(){
    return this.nss;
}
public abstract double Ingresos();
public String toString(){
    return "Nombre: "+ this.nombre + "\nApellido: "+this.apellido + "\nNSS: "+this.nss;
}

}
