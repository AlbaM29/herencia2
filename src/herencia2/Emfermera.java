/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author alba
 */
public class Emfermera {
    private String nombre;
    private int edad; 
    private String especialidad;
     private String turno; 
     
     
     public Emfermera (String nombre, int edad, String especialidad, String turno) {
         
         this.nombre = nombre;
         this.edad = edad;
         this.especialidad = especialidad;
         this.turno = turno;
     }
         
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad (String especialidad) {
        this.especialidad= especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno (String turno) {
        this.turno = turno;
    }         
}

