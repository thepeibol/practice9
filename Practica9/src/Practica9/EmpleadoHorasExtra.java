/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica9;

/**
 *
 * @author Peibol
 */
public class EmpleadoHorasExtra extends Empleado{
	private int horas;
	private double sueldo;

	public EmpleadoHorasExtra(String nombre,String apellido,String nss,int horas,double sueldo){
        super(nombre,apellido,nss);
        sethoras(horas);
        setsueldo(sueldo);
    }

    public void sethoras(int horas){
        this.horas=horas;
    }
    public void setsueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public int gethoras(){
        return this.horas;
    }
    public double getsueldo(){
        return this.sueldo;
    }

    public  double ingresos(){
    	if(horas < 40){
    		double ingresos=(horas*sueldo);
        	return ingresos;
    	}else{
    		double ingresos=(40*sueldo)+((horas - 40 )*sueldo*1.5);
        	return ingresos;
    	}
        
    }
}