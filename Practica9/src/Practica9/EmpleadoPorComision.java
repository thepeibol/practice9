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
public class EmpleadoPorComision extends Empleado{
    private double ventasTotales;
    private double tasaComision;
    public EmpleadoPorComision(String nombre,String apellido,String nss,double ventasTotales,double tasaComision){
        super(nombre,apellido,nss);
        setVentasTotales(ventasTotales);
        setTasaComision(tasaComision);
    }
    public  double ingresos(){
        double ingresos=(ventasTotales*tasaComision);
        return ingresos;
    }
    public void setVentasTotales(double ventasTotales){
        this.ventasTotales=ventasTotales;
    }
    public void setTasaComision(double tasaComision){
        this.tasaComision=tasaComision;
    }
    public double getVentasTotales(){
        return this.ventasTotales;
    }
    public double getTasaComision(){
        return this.tasaComision;
    }
}
