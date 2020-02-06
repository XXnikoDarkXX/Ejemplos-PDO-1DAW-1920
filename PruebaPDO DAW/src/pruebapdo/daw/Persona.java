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
public class Persona extends Animal{
    private String apellido; //el apellido de la persona
    private boolean genero; //true masculino, false femenino
    private String nacionalidad; //nacionalidad de la persona
    private Mascota[] mascota; //Las mascotas de esta persona
    private Persona madre; //Madre biológica
    private Persona padre; //Padre biológico
    
    public Persona(){
        super("Anonimo",(byte)50);
        String[] nombresPosiblesHombre={"Miguel","Raul","Alvaro","Nico","Javi","Dani","Jacob","Juan Luis","Jose","Tiburcio"};
        String[] nombresPosiblesMujer={"Noelia","Silvia","Angela","Claudia","Estefanía","Gregoria","Olga","Monica","Eugenia","Patricia"};
        String[] apellidosPosibles={"Jiménez","Gómez","Otero","Sánchez","Sanpatricio","Hashimura","Smith","Lennon","Strummer","Prattchet","Trump"};
        String[] nacionalidadesPosibles={"Española","Francesa","Inglesa","Alemana","Japonesa","Congoleña","Portuguesa","Italiana"};
        
        Random r=new Random();
        
        this.genero=r.nextBoolean();
        
        if(genero){
            //TODO mañana lo cambiamos
            //this.nombre=nombresPosiblesHombre[r.nextInt(nombresPosiblesHombre.length)];
        }else{
            //TODO mañana lo cambiamos
            //this.nombre=nombresPosiblesMujer[r.nextInt(nombresPosiblesMujer.length)];
        }
        this.apellido=apellidosPosibles[r.nextInt(apellidosPosibles.length)];
        this.nacionalidad=nacionalidadesPosibles[r.nextInt(nacionalidadesPosibles.length)];
        
        //TODO mañana lo cambiamos
        //this.edad=(byte)r.nextInt(100);
        
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
    public Persona(String n,String a,String genero,byte e,String na){
        super(n,e);
        this.setApellido(a);
        this.setNacionalidad(na);
        this.setGenero(genero);
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
    public Persona(String n,String a,String genero,byte e,String na,Mascota[] m){
        super(n,e);
        this.setApellido(a);
        this.setGenero(genero);
        this.setNacionalidad(na);
        this.setMascota(m);
    }
    
    /**
     * Constructor sin mascota, que permite poner padre y madre
     * @param n nombre
     * @param a apellido
     * @param e edad
     * @param na nacionalidad
     * @param m madre biologico
     * @param p padre biologico
     */
    public Persona(String n,String a,String genero,byte e,String na,
            Persona m,Persona p){
        super(n,e);
        this.setNacionalidad(na);
        this.setApellido(a);
        this.setGenero(genero);
        this.setMadre(m);
        this.setPadre(p);
        this.mascota=new Mascota[5];
    }
    
    /**
     * setter de genero a partir de un string
     * @param g genero, debe valer "Hombre" o "Mujer". Ignora las mayúsculas.
     */
    public final void setGenero(String g){
        if(g.toLowerCase().equals("hombre")){
            genero=true;
        }else if(g.toLowerCase().equals("mujer")){
            genero=false;
        }else{
            System.out.println("El genero solo puede valer \"Hombre\" o \"Mujer\"");
        }
    }
    
    /**
     * getter de género
     * @return String que vale "Hombre" o "Mujer".
     */
    public String getGenero(){
        return (genero?"Hombre":"Mujer");
    }
    
    
    
    /**
     * método que concatena en un string todos los datos de persona
     * @return todos los datos de persona
     */
    public String toString() {
        String aux="";
       if(apellido!=null){
            aux+=apellido;
       }
       aux+="\n---------------------\n";
       if(genero){
           aux+="Genero: Hombre\n";
       }else{
           aux+="Genero: Mujer\n";
       }
       if(nacionalidad!=null){
             aux+="Nacionalidad: "+nacionalidad+"\n";
       }
       if(this.madre!=null){
           //aux+="Madre: "+madre.nombre+" "+madre.apellido+"\n";
       }
       if(this.padre!=null){
           //aux+="Padre: "+padre.nombre+" "+padre.apellido+"\n";
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
        //TODO mañana la cambiamos
        // this.edad++;
    }
    
    /**
     * función que compara la edad de dos personas
     * @param p2 persona con la que se comparará la edad
     * @return true-> this es mayor que p2, false-> en caso contrario
     */
    //TODO mañana la cambiamos
    /*public boolean mayorQue(Persona p2){
        return edad>p2.edad;
    }*/

    
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
     * getter de madre
     * @return madre de la persona actual
     */
    public Persona getMadre(){
        return this.madre;
    }
    
    /**
     * getter de padre
     * @return padre de la persona actual
     */
    public Persona getPadre(){
        return this.padre;
    }
    
    /**
     * setter de madre, solo funciona si no hay ninguna 
     * establecida antes
     * @param m madre asignada a la persona. Debe ser una mujer.
     */
    public final void setMadre(Persona m){
        //Compruebo que la madre no se haya puesto antes y sea mujer
        if(this.madre==null&&m.genero==false){
           this.madre=m;
        }else{
            System.out.println("Madre no hay más que una, debe ser mujer. "
                    + "Y no puedes cambiarla. "
                    + "Te aguantas con la que te toca.");
        }
    }
    
    /**
     * setter de padre. Solo funciona si no se ha establecido padre antes
     * @param p padre de la persona actual. Debe ser un hombre.
     */
    public final void setPadre(Persona p){
        //Compruebo que el padre no se ha establecido antes y es hombre
        if(this.padre==null&&p.genero==true){
            this.padre=p;
        }else{
            System.out.println("Te quedas con el padre que tienes. Debe ser hombre."
                    + " No vale cambiarlo al butanero.");
        }
    }
   
    
    /**
     * setter de apellido
     * @param a nuevo apellido
     */
    final public void setApellido(String a){
        this.apellido=a;
    }
    
    /**
     * Setter de nacionalidad
     * @param n la nueva nacionalidad
     */
    public final void setNacionalidad(String n){
        this.nacionalidad=n;
    }
    

   
    public final void setMascota(Mascota[] m){
        this.mascota=m;
    }
    
    public Mascota[] getMascota(){
        return this.mascota;
    }
    
    
    
}
