/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapdo.daw;

import java.util.Random;

/**
 *Clase que modela a una persona para mi programa de pruebas
 * @author Miguel Páramos
 */
public class Persona {
    private String nombre; //el nombre de la persona
    private String apellido; //el apellido de la persona
    private byte edad; //la edad de la persona. Debe estar entre 0 y 130
    private String nacionalidad; //nacionalidad de la persona
    private Mascota[] mascota; //Las mascotas de esta persona
    
    public Persona(){
        String[] nombresPosibles={"Miguel","Raul","Alvaro","Nico","Javi","Dani","Noelia","Jacob","Juan Luis","Jose"};
        String[] apellidosPosibles={"Jiménez","Gómez","Otero","Sánchez","Sanpatricio","Hashimura","Smith","Lennon","Strummer","Prattchet","Trump"};
        String[] nacionalidadesPosibles={"Española","Francesa","Inglesa","Alemana","Japonesa","Congoleña","Portuguesa","Italiana"};
        
        Random r=new Random();
        
        this.nombre=nombresPosibles[r.nextInt(nombresPosibles.length)];
        this.apellido=apellidosPosibles[r.nextInt(apellidosPosibles.length)];
        this.nacionalidad=nacionalidadesPosibles[r.nextInt(nacionalidadesPosibles.length)];
        
        this.edad=(byte)r.nextInt(100);
        
        this.mascota=new Mascota[r.nextInt(6)];
        for (int i = 0; i < mascota.length; i++) {
            mascota[i]=new Mascota();
        }
    
    }
    
    /**
     * Constructor de persona con todos 
     * los datos menos mascota
     * @param n nombre
     * @param a apellido
     * @param e edad
     * @param na nacionalidad
     */
    public Persona(String n,String a,byte e,String na){
        this.setNombre(n);
        this.setApellido(a);
        this.setEdad(e);
        this.setNacionalidad(na);
        this.mascota=new Mascota[5];
    }
    
    /**
     * Constructor con todos los datos
     * @param n nombre
     * @param a apellidos
     * @param e edad
     * @param na nacionalidad
     * @param m array de mascota
     */
    public Persona(String n,String a,byte e,String na,Mascota[] m){
        this.setNombre(n);
        this.setApellido(a);
        this.setEdad(e);
        this.setNacionalidad(na);
        this.setMascota(m);
    }
    /**
     * método que concatena en un string todos los datos de persona
     * @return todos los datos de persona
     */
    public String toString() {
        String aux="";
       aux+=nombre+" ";
       if(apellido!=null){
            aux+=apellido;
       }
       aux+="\n---------------------\n";
       if(nacionalidad!=null){
             aux+="Nacionalidad: "+nacionalidad+"\n";
       }
       if(edad!=0){
           aux+="Edad: "+edad+"\n";
       }
       for(int i=0;i<mascota.length;i++){
           if(mascota[i]!=null){
                aux+=mascota[i]+"\n";
           }
       }
        return aux;
    }
    
    /**
     * función que añade un año a la edad de la persona
     */
    public void cumplirAños(){
        this.edad++;
    }
    
    /**
     * función que compara la edad de dos personas
     * @param p2 persona con la que se comparará la edad
     * @return true-> this es mayor que p2, false-> en caso contrario
     */
    public boolean mayorQue(Persona p2){
        return edad>p2.edad;
    }
    
    /**
     * getter de nombre
     * @return nombre de la persona
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * getter de apellido
     * @return apellido de la persona
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * getter de nacionalidad
     * @return nacionalidad de la persona
     */
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    /**
     * getter de edad
     * @return edad de la persona en años
     */
    public String getEdad(){
        return this.edad+" años";
    }
    
    /**
     * Setter de nombre
     * @param n nuevo nombre
     */
    public void setNombre(String n){
        this.nombre=n;
    }
    
    /**
     * setter de apellido
     * @param a nuevo apellido
     */
    public void setApellido(String a){
        this.apellido=a;
    }
    
    /**
     * Setter de nacionalidad
     * @param n la nueva nacionalidad
     */
    public void setNacionalidad(String n){
        this.nacionalidad=n;
    }
    
    /**
     * Setter de edad
     * @param e la nueva edad
     */
    public void setEdad(byte e){
        if(e>0){
            this.edad=e;
        }else{
            System.out.println("Edad no válida. No se va a cambiar");
        }
    }
   
    public void setMascota(Mascota[] m){
        this.mascota=m;
    }
    
    public Mascota[] getMascota(){
        return this.mascota;
    }
    
    
    
}
