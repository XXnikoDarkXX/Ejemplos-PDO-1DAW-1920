/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import pruebapdo.daw.Mascota;
import pruebapdo.daw.Persona;

/**
 *
 * @author Ccenec
 */
public class PruebaStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona();
        Persona p2=new Persona();
        Mascota m1=new Mascota();
        p1.setNombre("Miguel");
        System.out.println(p1+"\n"+p2+"\n"+m1);
        
    }
    
}
