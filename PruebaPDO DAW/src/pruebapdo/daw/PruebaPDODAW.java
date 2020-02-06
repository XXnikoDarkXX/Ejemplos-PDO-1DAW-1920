/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapdo.daw;

import java.util.Scanner;

/**
 *  Clase principal que ejecuta el programa de prueba
 * @author Miguel Páramos
 */
public class PruebaPDODAW {

    /**
     * Main de pruebas,donde solo pruebo variables
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Persona aleatorio=new Persona();
        System.out.println("Tu persona es:");
        System.out.println(aleatorio);
        byte opcion=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Elige cosa a cambiar en la persona:"
                    + "\n\t1- Nombre\n\t2- Apellido\n\t3- Nacionalidad\n\t"
                    + "4- Edad\n\t5- Genero\n\t6- Crear Madre\n\t7- Crear Padre\n\t8- Salir");
            opcion=Byte.parseByte(sc.nextLine());
            switch(opcion){
                case 1: //Nombre
                    System.out.println("Tu nombre es "+
                            aleatorio.getNombre()+". Introduce nuevo nombre:");
                    aleatorio.setNombre(sc.nextLine());
                    break;
                case 2: //Apellido
                    System.out.println("Tu apellido es "+
                            aleatorio.getApellido()+". Introduce nuevo apellido: ");
                    aleatorio.setApellido(sc.nextLine());
                    break;
                case 3: //Nacionalidad
                    System.out.println("Tu nacionalidad es "+
                            aleatorio.getNacionalidad()+". Introduce la nueva:");
                    aleatorio.setNacionalidad(sc.nextLine());
                   break;
                case 4: //Edad
                    System.out.println("Tu edad es "+
                            aleatorio.getEdad()+". Introduce la nueva edad: ");
                    aleatorio.setEdad(Byte.parseByte(sc.nextLine()));
                    break;
                case 5: //genero
                    System.out.println("Tu genero es "+
                            aleatorio.getGenero()+". Introduce el nuevo genero: ");
                    aleatorio.setGenero(sc.nextLine());
                    break;
                case 6: //madre
                    if(aleatorio.getMadre()==null){
                        System.out.println("Dime cómo se llama tu madre:");
                        String n=sc.nextLine();
                        System.out.println("Dime el apellido de tu madre:");
                        String a=sc.nextLine();
                        System.out.println("Dime la nacionalidad de tu madre:");
                        String na=sc.nextLine();
                        System.out.println("Dime la edad de tu madre:");
                        byte e=Byte.parseByte(sc.nextLine());
                        aleatorio.setMadre(new Persona(n,a,"Mujer",e,na));
                    }else{
                        System.out.println("Ya estableciste madre. No puedes volver a hacerlo.");
                    }
                    break;
                case 7: //padre
                    if(aleatorio.getPadre()==null){
                        System.out.println("Dime cómo se llama tu padre:");
                        String n=sc.nextLine();
                        System.out.println("Dime el apellido de tu padre:");
                        String a=sc.nextLine();
                        System.out.println("Dime la nacionalidad de tu padre:");
                        String na=sc.nextLine();
                        System.out.println("Dime la edad de tu padre:");
                        byte e=Byte.parseByte(sc.nextLine());
                        aleatorio.setPadre(new Persona(n,a,"Hombre",e,na));
                    }else{
                        System.out.println("Ya estableciste padre. No puedes volver a hacerlo.");
                    }
                    break;
                case 8: //Salir
                    
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion!=8);
        
        System.out.println("Vas a jugar con la persona: ");
        System.out.println(aleatorio);
    }
        
}
