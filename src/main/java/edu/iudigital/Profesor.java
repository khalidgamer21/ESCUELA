package edu.iudigital;
import java.time.LocalDate;
public class Profesor extends Persona {
        private String especialidad;
        private int experiencia;

        public Profesor(String nombre, String apellido, LocalDate fechaNacimiento, String genero, double estatura, double peso, String especialidad, int experiencia) {
                super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
                this.especialidad = especialidad;
                this.experiencia = experiencia;
        }

        public String getEspecialidad() { return especialidad; } // Getter para especialidad
        public int getExperiencia() { return experiencia; } // Getter para experiencia

}
