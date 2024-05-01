/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coche;

/**
 *
 * @author José
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
                System.out.println("Menu:");
                System.out.println("1. Agregar coche");
                System.out.println("2. Modificar coche");
                System.out.println("3. Eliminar coche");
                System.out.println("4. Mostrar coches");
                System.out.println("5. Salir");
                System.out.print("Ingrese una opcion: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

            switch (opcion) {
                case 1:
                 System.out.print("Ingrese ID: ");
                 int id = scanner.nextInt();
                scanner.nextLine();
                  System.out.print("Ingrese marca: ");
                 String marca = scanner.nextLine();
                  System.out.print("Ingrese modelo: ");
                 String modelo = scanner.nextLine();
                  System.out.print("Ingrese ano: ");
                 int ano = scanner.nextInt();
                  scanner.nextLine();
                  System.out.print("Ingrese tipo: ");
                 String tipo = scanner.nextLine();
                 System.out.print("Ingrese numero de chasis: ");
                    String numeroChasis = scanner.nextLine();
                 System.out.print("Ingrese color: ");
                    String color = scanner.nextLine();
                  Coche coche = new Coche(id, marca, modelo, ano, tipo, numeroChasis, color);
                  listaCoches.add(coche);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del coche a modificar: ");
                    int idModificar = scanner.nextInt();
                    scanner.nextLine();

              for (Coche c : listaCoches) {
                    if (c.getId() == idModificar) {
                  System.out.print("Ingrese nueva marca: ");
                 c.setMarca(scanner.nextLine());
                 System.out.print("Ingrese nuevo modelo: ");
                c.setModelo(scanner.nextLine());
                   System.out.print("Ingrese nuevo ano: ");
                   c.setAno(scanner.nextInt());
                   scanner.nextLine();
                 System.out.print("Ingrese nuevo tipo: ");
                   c.setTipo(scanner.nextLine());
                  System.out.print("Ingrese nuevo numero de chasis: ");
                  c.setNumeroChasis(scanner.nextLine());
                   System.out.print("Ingrese nuevo color: ");
               c.setColor(scanner.nextLine());
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ID del coche a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();

                    listaCoches.removeIf(c -> c.getId() == idEliminar);
                    break;
                case 4:
                    for (Coche c : listaCoches) {
                        System.out.println("ID: " + c.getId() + ", Marca: " + c.getMarca() + ", Modelo: " + c.getModelo() + ", Ano: " + c.getAno() + ", Tipo: " + c.getTipo() + ", Numero de Chasis: " + c.getNumeroChasis() + ", Color: " + c.getColor());
                    }
                    break;
                case 5:
                  
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
