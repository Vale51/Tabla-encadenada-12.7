/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12.pkg7.tabla.encadenada;

/**
 *
 * @author user
 */
public class TipoSocio
{
    class Fecha
    {
        int dia;
        int mes;
        int anno;
        Fecha (int d, int m, int a)
        {
            dia = d;
            mes = m;
            anno = a;
        }
       
        public String fecha()
        {
            return " " + dia + "-" + mes + "-" + anno;
        }
    };
    int codigo;
    private String nombre;
    private int edad;
    Fecha f;
    
    public TipoSocio(String n, int c, int e, int d, int m, int a)
    {
        codigo = c;
        nombre = n;
        edad = e;
        f = new Fecha(d, m, a);
    }

    
    public int getCodigo()
    {
        return codigo;
    }
    
    void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("codigo: " + codigo);
        System.out.println("edad: " + edad);
        System.out.println("fecha: " + f.fecha());
    }
    
       
}
