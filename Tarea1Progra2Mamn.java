/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1progra2.mamn;

import java.util.Scanner;

/**
 *
 * @author Marjorie
 */
public class Tarea1Progra2Mamn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        String nom;
        double cant;
        String digit;
        double r;
        
        System.out.print("Ingrese su nombre: ");
        nom = entrada.nextLine();
        System.out.print("Ingrese la cantidad de dinero: ");
        
        cant = Double.parseDouble(entrada.nextLine());
        System.out.println("Deseas convertir la cantidad de dinero en:");
        
        System.out.println("1. Dólares");
        System.out.println("2. Euros");
        System.out.println("3. Yuanes");
        
        System.out.print("Por favor ingresa el numero de la opción que deseas: ");
        digit = entrada.nextLine();
        
                switch (digit) {
            case "1":
                r = cant*0.13;
                System.out.print("En Dolares "+r);
                break;
            case "2":
                r = cant*0.11;
                System.out.print("En Euros "+r);
                break;
            case "3":
                r = cant*0.83;
                System.out.print("En Yuanes "+r);
                
                break;
            default: System.out.println("Numero Invalido");break;
        }

    }
    
}
