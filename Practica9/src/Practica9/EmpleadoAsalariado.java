/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica9;

/**
 *
 * @author Pepe
 */
public class EmpleadoAsalariado extends Empleado{
	private double salarioSemanal;
	public EmpleadoAsalariado(String nombre,String apellido,String nss,double salarioSemanal){
		super(nombre,apellido,nss);
		setSalarioSemanal(salarioSemanal);
	}
	public double ingresos(){
		double ingresos=salarioSemanal;
		return ingresos;
	}
	public void setSalarioSemanal(double salarioSemanal){
		this.salarioSemanal=salarioSemanal;
	}
	public double getSalarioSemanal(){
		return this.salarioSemanal;
	}
	}