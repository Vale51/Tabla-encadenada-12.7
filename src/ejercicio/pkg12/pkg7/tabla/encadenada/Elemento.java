/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12.pkg7.tabla.encadenada;

/**
 *
 * @author user
 */
public class Elemento
    {
        TipoSocio socio;
        Elemento sgte;
           
        public Elemento(TipoSocio e)
        {
            socio = e;
            sgte = null;
        }
        public TipoSocio getSocio()
        {
            return socio;
        }
    }
