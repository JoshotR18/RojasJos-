/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;

/**
 *
 * @author José
 */
public class Suma {
    private int numero1;
    private int numero2;
    
    public void Sumar(int n1, int n2){
        this.numero1=n1;
        this.numero2=n2;
    }
    public int Sumando(){
       return numero1+numero2; 
    }
    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public static void main(String[]args){
       
    }
 
}
