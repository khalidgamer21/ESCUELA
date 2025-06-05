package edu.iudigital;
import java.time.LocalDate;
public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String genero;
    private double estatura;
    private double peso;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, String genero, double estatura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }
}
