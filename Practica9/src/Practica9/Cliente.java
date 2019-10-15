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
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Cliente {
    public static void main(String[] args){
	DecimalFormat dosDigitos = new DecimalFormat("0.00");
                
        // Crear arreglo tipo empleado
        Empleado empleados[] = new Empleado[4];
        
        // inicializar arreglo de Empleados
        empleados[0] = new EmpleadoAsalariado("Juan", "Perez", "111-11-1111", 800.00);
        empleados[1] = new EmpleadoPorComision("Jose", "Pintor", "222-22-2222", 10002, 0.06);
        empleados[2] = new EmpleadoBaseMasComision("Alfonso", "Romero", "333-33-3333", 5000.00, 0.04, 300);
        empleados[3] = new EmpleadoPorHoras("Juan", "Perez", "444-44-4444", 16.75, 40);
        
        String salida = "";
        
        // Procesar genéricamente cada elemento en el arreglo empleados
        for (int i = 0; i< empleados.length; i++){
            salida += empleados[i].toString();
            
            // determinar si el elemento es un EmpleadoBaseMasComision
            if(empleados[i] instanceof EmpleadoBaseMasComision){
                // conversion descendente de Empleado a EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleadoActual = (EmpleadoBaseMasComision)empleados[i];
                
                double salarioBaseAnterior = empleadoActual.getSalarioBase();
                salida += "\nsalario base anterior: $" + salarioBaseAnterior;
                
                empleadoActual.setSalarioBase(1.10 * salarioBaseAnterior);
                salida += "\nel nuevo salario base con aumento del 10% es: $" + empleadoActual.getSalarioBase();
            }
            
            salida += "\ngano $" + empleados[i].ingresos() + "\n";
        }
        
        //obtener nombre del tipo de cada objeto en el arreglo empleados
        for(int j = 0; j < empleados.length; j++){
            salida += "\nEl empleado " + j + " es un " + empleados[j].getClass().getName();
        }
        
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }
    
}
