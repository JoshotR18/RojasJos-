/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.suma;

import java.util.Scanner;

/**
 *
 * @author José
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}

class GrupoPersonas {
    private List<Persona> personas;

    public GrupoPersonas() {
        personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public double calcularPromedioEdades(boolean esMayorEdad) {
     int suma = 0;
     int contador = 0;
     for (Persona persona : personas) {
      if ((esMayorEdad && persona.getEdad() >= 18) || (!esMayorEdad && persona.getEdad() < 18)) {
        suma += persona.getEdad();
          contador++;
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }
}

public class CalculadoraEdades {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GrupoPersonas grupo = new GrupoPersonas();

     System.out.println("Ingrese la cantidad de personas en el grupo:");
     int cantidad = scanner.nextInt();

   for (int i = 0; i < cantidad; i++) {
   System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
    int edad = scanner.nextInt();
     grupo.agregarPersona(new Persona(edad));
        }

        double promedioMayores = grupo.calcularPromedioEdades(true);
        double promedioMenores = grupo.calcularPromedioEdades(false);

        System.out.println("El promedio de edades para los mayores de edad es: " + promedioMayores);
        System.out.println("El promedio de edades para los menores de edad es: " + promedioMenores);
    }
}
