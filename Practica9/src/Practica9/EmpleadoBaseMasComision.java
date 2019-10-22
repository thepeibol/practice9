/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica9;

/**
 *
 * @author marco
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    public EmpleadoBaseMasComision(String nombre,String apellido,String nss,double ventasTotales,double tasaComision,double salarioBase){
        super(nombre,apellido,nss,ventasTotales,tasaComision);
        setSalarioBase(salarioBase);
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }
    public  double ingresos(){
        double ingresos=super.ingresos()+salarioBase;
        return ingresos;
    }
}
