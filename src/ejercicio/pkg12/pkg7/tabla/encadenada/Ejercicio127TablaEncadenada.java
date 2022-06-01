/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12.pkg7.tabla.encadenada;

import java.util.Scanner;
public class Ejercicio127TablaEncadenada {

    public static void main(String[] args) {
        
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();
        Scanner sc = new Scanner(System.in);
        int menu = 1, codigo, edad, dia, mes, año;
        String nombre;
        TipoSocio socio;
        
        
        
        while(menu!=0){
            System.out.println("Seleccione una opcion:");
            System.out.println("1.Insertar un socio");
            System.out.println("2.Buscar un socio");
            System.out.println("3.Eliminar un socio");
            
            menu = sc.nextInt();
            sc.nextLine();
            
            switch(menu){
                case 1:
                    
                    System.out.println("Ingrese el nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el codigo:");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la edad:");
                    edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el dia:");
                    dia = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el mes:");
                    mes = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese el año:");
                    año = sc.nextInt();
                    sc.nextLine();
                    
                    
                    socio = new TipoSocio(nombre, codigo, edad, dia, mes, año);
                    
                    tabla.insertar(socio);a
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Ingrese el codigo:");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    tabla.buscar(codigo).getSocio().mostrar();
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese el codigo:");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    tabla.eliminar(codigo);
                    
                    break;       
            }
        }
    }
    
}
