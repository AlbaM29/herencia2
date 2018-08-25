/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Scanner;

/**
 *
 * @author alba
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emfermera emfermera1 = new Emfermera ("andrea", 10, "Enfernera pediatra", "matutino");
        
        System.out.println(emfermera1.getNombre());
        
        
        Medico medico1 = new Medico ("fernando",
                30,
                "cirujano",
                "matutino", 
                "dentista",
                  8.30);
       System.out.println(medico1.getEspecialidad());
       Scanner entrada = new Scanner (System.in);
       String nombre; 
        int edad;
        String especialidad;
        String turno;
        String area;
        int horario;
        System.out.println("ingresa el nombre del medico");
        nombre= entrada.next();
        System.out.println("ingresa la edad del medico");
        edad = entrada.nextInt();
        System.out.println("ingresa la especialidad del medico");
        especialidad = entrada.next();
        System.out.println("ingresa el turno del medico");
        turno= entrada.next();
        System.out.println("ingresa la area del medico");
        area= entrada.next();
        System.out.println("ingresa el horario");
        horario = entrada.nextInt();
    
         Medico nuevo_medico = new Medico(
                nombre,
                edad,
                especialidad,
                turno,
                area,
                horario);
        System.out.println(nuevo_medico.getNombre());
        System.out.println(nuevo_medico.getEdad());
        System.out.println(nuevo_medico.getEspecialidad());
        System.out.println(nuevo_medico.getTurno());
        System.out.println(nuevo_medico.getArea());
        
        
    }
    }

