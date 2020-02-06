/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapdo.daw;

/**
 *
 * @author Ccenec
 */
public class Animal {
    private String nombre; //El nombre del animal
    private byte edad; //Edad en años del animal

    public Animal(String nombre, byte edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }
    
        
    
    /**
     * getter de nombre
     * @return nombre de la persona
     */
    public String getNombre(){
        return this.nombre;
    }
    
        /**
     * getter de edad
     * @return edad de la persona en años
     */
    public String getEdad(){
        return this.edad+" años";
    }
    
     /**
     * Setter de nombre con filtro anticanis
     * @param n nuevo nombre
     */
    public final void setNombre(String n){
        //Todavía no os hemos enseñado ER :'(
        this.nombre=n.replace("0","").replace("1","").replace("2","")
                .replace("3","").replace("4","").replace("5","")
                .replace("6","").replace("7","").replace("8","")
                .replace("9","").replace("_","").replace("-","").
                toLowerCase().replace("xxx", "");
        String primeraLetra=
                nombre.substring(0,1).toUpperCase();
        nombre=primeraLetra+nombre.substring(1);
    }
    
        /**
     * Setter de edad
     * @param e la nueva edad
     */
    public final void setEdad(byte e){
        if(e>0){
            this.edad=e;
        }else{
            System.out.println("Edad no válida. No se va a cambiar");
        }
    }
   
}
