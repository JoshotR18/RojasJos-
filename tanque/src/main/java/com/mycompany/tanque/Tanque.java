/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tanque;

/**
 *
 * @author José
 */
import java.util.Scanner;
public class Tanque {

 

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temperatura;
     
        String momentoDelDia;
       
        System.out.print("Ingrese el momento del dia(mañana, tarde o noche): ");
        momentoDelDia=scan.nextLine();
        
        
        System.out.print("Ingrese la temperatura: ");
        temperatura=scan.nextInt();
        
       switch(momentoDelDia){
           case "mañana": 
               if(temperatura>25){
                  System.out.println("Temperatura alta"); 
               }
               if(temperatura>=0&&temperatura<=10){
                   System.out.println("Temperatura perfecta");
               }
               if(temperatura<=24&&temperatura>=11){
                   System.out.println("Temperatura normal");
               }
               break;
           case "tarde": 
                      if(temperatura>40){
                  System.out.println("Temperatura alta"); 
               }
               if(temperatura>=0&&temperatura<=15){
                   System.out.println("Temperatura perfecta");
               }
               if(temperatura<=39&&temperatura>=16){
                   System.out.println("Temperatura normal");
               }
               break;
               case "noche": 
                      if(temperatura>34){
                  System.out.println("Temperatura alta"); 
               }
               if(temperatura>=0&&temperatura<=12){
                   System.out.println("Temperatura perfecta");
               }
               if(temperatura<=33&&temperatura>=13){
                   System.out.println("Temperatura normal");
               }
               break;
               
               
       }
    }
}
