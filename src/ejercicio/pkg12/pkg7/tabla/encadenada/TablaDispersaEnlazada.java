/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12.pkg7.tabla.encadenada;

/**
 *
 * @author user
 */
public class TablaDispersaEnlazada {
    
    static int M = 97;
    int numElementos;
    static final double R = 0.618034;
    Elemento[] tabla;
    
    public TablaDispersaEnlazada() // constructor
    {
        tabla = new Elemento[M];
        for (int k = 0; k < M; k++)
            tabla[k] = null;
        numElementos = 0;
    }
    
    static int dispersion(long x)
    {
        double t;
        int v;
        t = R * x - Math.floor(R * x); // parte decimal
        v = (int) (M * t);
        return v;
    }
    
    public void insertar(TipoSocio s)
    {
        int posicion;
        Elemento nuevo;
        posicion = dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }
    
    boolean conforme(TipoSocio a){
        return true;
    }
    
    public Elemento buscar(int codigo)
    {
        Elemento p = null;
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null)
        {
            p = tabla[posicion];
            while ((p.sgte != null) && p.socio.codigo != codigo)
                p = p.sgte;
            if (p.socio.codigo != codigo)
                p = null;
        }
        return p;
    }
    
    public void eliminar(int codigo)
    {
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null) // no está vacía
        {
            Elemento anterior, actual;
            anterior = null;
            actual = tabla[posicion];

            while ((actual.sgte != null) &&
            actual.getSocio().getCodigo() != codigo)
            {
                anterior = actual;
                actual = actual.sgte;
            }
            if (actual.getSocio().getCodigo() != codigo)
                System.out.println("No se encuentra en la tabla el socio "
                + codigo);
            else if (conforme (actual.getSocio())) //se retira el nodo
            {
                if (anterior == null) // primer nodo
                tabla[posicion] = actual.sgte;

                else
                    anterior.sgte = actual.sgte;

                actual = null;
                numElementos--;
            }
        }
    }
    
}
