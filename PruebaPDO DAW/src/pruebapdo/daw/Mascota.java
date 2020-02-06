/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapdo.daw;

import java.util.Random;

/**
 * Clase que modela una mascota
 *
 * @author Miguel Páramos
 */
public class Mascota extends Animal{

    private String especie; //La especie de la mascota. (Gato, perro, pollo..)
    private String raza;//La raza de la mascota (Pastor alemán, bodeguero, angora...)
    private float peso; //peso en kg de la mascota

    /**
     * Constructor con todos los datos de mascota
     *
     * @param n nombre
     * @param e especie
     * @param r raza
     * @param ed edad en años
     * @param p peso en kg
     */
    public Mascota(String n, String e, String r, byte ed, float p) {
        super(n,ed);
        this.especie = e;
        this.raza = r;
        this.peso = p;
    }

    public Mascota() {
        super("Anonimo",(byte)12);
        String[] nombresPosibles = {"Buster", "Bolt", "Pancho", "Sancho", "Garfield", "Coco", "Turuleta", "Sultán", "Aladín", "Sputnik"};
        String[] especiesPosibles = {"Perro", "Gato", "Agaporni", "Serpiente", "Cobaya", "Loro", "Pez", "Conejo", "Lagarto", "Tortuga", "Araña"};
        String[] razasPosibles=null;
        
        Random r=new Random();
        //TODO, echarle cuentas a esto mañana
        //this.nombre=nombresPosibles[r.nextInt(nombresPosibles.length)];
        this.especie=especiesPosibles[r.nextInt(especiesPosibles.length)];
        
        if (this.especie.equals("Perro")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Bodeguero";
            razasPosibles[1] = "Labrador";
            razasPosibles[2] = "Pastor";
            razasPosibles[3] = "Chihuahua";
            razasPosibles[4] = "Terrier";
            razasPosibles[5] = "Chucho";
        }
        if (this.especie.equals("Araña")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Vagabunda";
            razasPosibles[1] = "Saltadora";
            razasPosibles[2] = "Tarántula";
            razasPosibles[3] = "Reclusa Parda";
            razasPosibles[4] = "Lobo";
            razasPosibles[5] = "Viuda Negra";
        }

        if (this.especie.equals("Agaporni")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Roseicollis";
            razasPosibles[1] = "Fischeri";
            razasPosibles[2] = "Personata";
            razasPosibles[3] = "Papilleros";
            razasPosibles[4] = "Taranta";
            razasPosibles[5] = "Lilianae";
        }
        if (this.especie.equals("Lagarto")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Camaleón";
            razasPosibles[1] = "Chuckwalla";
            razasPosibles[2] = "Anolis";
            razasPosibles[3] = "Monstruo de Gila";
            razasPosibles[4] = "Diablo espinoso";
            razasPosibles[5] = "Iguana rinoceronte";
        }

        if (this.especie.equals("Serpiente")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Cobra Filipina";
            razasPosibles[1] = "Cascabel";
            razasPosibles[2] = "Tigre";
            razasPosibles[3] = "Mamba";
            razasPosibles[4] = "Traipan";
            razasPosibles[5] = "Vibora de la muerte";
        }

        if (this.especie.equalsIgnoreCase("Conejo")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Angora";
            razasPosibles[1] = "Holandés";
            razasPosibles[2] = "Mini Rex";
            razasPosibles[3] = "Cabeza de León";
            razasPosibles[4] = "Mini lop";
            razasPosibles[5] = "Azul de viena";
        }

        if (this.especie.equals("Gato")) {
            razasPosibles = new String[5];
            razasPosibles[0] = "Abisinio";
            razasPosibles[1] = "Siamés";
            razasPosibles[2] = "Bengala";
            razasPosibles[3] = "Siberiano";
            razasPosibles[4] = "Esfinge";

        }
        if (this.especie.equals("Tortuga")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Rusa";
            razasPosibles[1] = "Orejas Rosa";
            razasPosibles[2] = "Orejas Amarillas";
            razasPosibles[3] = "Cumberland";
            razasPosibles[4] = "Carey";
            razasPosibles[5] = "Laúd";
        }

        if (this.especie.equals("Pez")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Cometa";
            razasPosibles[1] = "Ojo telescopio";
            razasPosibles[2] = "Cabeza de leon";
            razasPosibles[3] = "Moro Negro";
            razasPosibles[4] = "Ryukin";
            razasPosibles[5] = "Abanico";
        }

        if (this.especie.equals("Cobaya")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Abyssinian";
            razasPosibles[1] = "Peruvian";
            razasPosibles[2] = "Silkie";
            razasPosibles[3] = "Teddy";
            razasPosibles[4] = "Texel";
            razasPosibles[5] = "Himalayas";
        }
        if (this.especie.equals("Loro")) {
            razasPosibles = new String[6];
            razasPosibles[0] = "Cotorra";
            razasPosibles[1] = "Guacamallo Glauco";
            razasPosibles[2] = "Gris";
            razasPosibles[3] = "Azul y Amarillo";
            razasPosibles[4] = "Cariamarillo";
            razasPosibles[5] = "Lori Arcoiris";
        }
        
        this.raza=razasPosibles[r.nextInt(razasPosibles.length)];
        //TODO echarle cuentas mañana
        //this.edad=(byte)r.nextInt(15);
        this.peso=r.nextInt(15);
        
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    

    @Override
    public String toString() {
        return "Mascota{" +  ", especie=" + especie + ", raza=" + raza + ", peso=" + peso + '}';
    }

}
