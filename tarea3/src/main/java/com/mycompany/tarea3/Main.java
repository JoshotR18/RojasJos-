/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea3;

/**
 *
 * @author José
 */
import java.util.ArrayList;
import java.util.Scanner;
class Empleado {

   
    String nombre;
    int cedula;
    int salario;

    Empleado(String nombre, int cedula, int salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }
}

            public class Main {
              
                
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("José", 89345723, 234325));
        empleados.add(new Empleado("braian", 6300426, 60345));
        empleados.add(new Empleado("sergio", 6300424, 5376542));
System.out.println("ingrese el numeo de cedula que quiere buscar: ");
  int buscar;
buscar=scan.nextInt();
   boolean encontrado = false;

        for (Empleado empleado : empleados) {
                if (empleado.cedula == buscar) {
                    System.out.println("Empleado encontrado: " + empleado.nombre);
                    encontrado = true;
                    break;
                }
            }

        if (!encontrado) {
            System.out.println("El empleado no existe");
        }
        int cantidadDeElementos=empleados.size();
        System.out.print("La cantidad total de empleados es: "+cantidadDeElementos);
    }
}
