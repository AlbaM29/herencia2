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
public class Medico extends Emfermera {
    
    
    private String area;
    private double horario;
    private String turno;

    public Medico(String nombre, int edad, String especialidad, String turno,String area,
            double horario) {
        super(nombre, edad, especialidad, turno);
        this.area = area;
        this.horario = horario;
        this.turno = turno;
        
        
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    
}
