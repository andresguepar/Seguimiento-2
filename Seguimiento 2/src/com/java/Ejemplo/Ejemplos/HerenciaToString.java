package com.java.Ejemplo.Ejemplos;

import com.java.Ejemplo.EjemploUdemy.Alumno;
import com.java.Ejemplo.EjemploUdemy.AlumnoInternacional;
import com.java.Ejemplo.EjemploUdemy.Persona;
import com.java.Ejemplo.EjemploUdemy.Profesor;

public class HerenciaToString {
    public static void main(String[] args) {

        System.out.println("Instancia de la clase Alumno ");
        Alumno alumno = new Alumno("Andres", "Guzman", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("andres@correo.com");

        System.out.println("Instancia de la clase AlumnoInternacional");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("Instancia de la clase de Profesor ");
        Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");

        System.out.println(" ======== - =======");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println(" ==================================");
        System.out.println(persona);
    }
}
