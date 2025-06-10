package edu.iudigital;

import java.time.LocalDate;

public class Profesor extends Persona {
        private String especialidad;
        private int experiencia;

        // Punto d: TDA arreglo para almacenar hasta 50 profesores
        private static Profesor[] listaProfesores = new Profesor[50];
        private static int contador = 0;

        public Profesor(String nombre, String apellido, LocalDate fechaNacimiento,
                        String genero, double estatura, double peso,
                        String especialidad, int experiencia) {
                super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
                this.especialidad = especialidad;
                this.experiencia = experiencia;

                // Agregar el nuevo profesor al arreglo si hay espacio
                if (contador < listaProfesores.length) {
                        listaProfesores[contador] = this;
                        contador++;
                } else {
                        System.out.println("Límite de profesores alcanzado.");
                }
        }

        public String getEspecialidad() {
                return especialidad;
        }

        public int getExperiencia() {
                return experiencia;
        }

        // Método para obtener la lista completa de profesores
        public static Profesor[] getListaProfesores() {
                return listaProfesores;
        }

        // Método opcional para mostrar los profesores
        public static void mostrarProfesores() {
                for (int i = 0; i < contador; i++) {
                        Profesor p = listaProfesores[i];
                        System.out.println(p.getNombre() + " " + p.getApellido() + " - " + p.getEspecialidad());
                }
        }
}
