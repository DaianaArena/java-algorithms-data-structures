package Exercises.TP3;

import Exercises.TP3.src.Hash.Hash;

public class App {

    public static void main(String[] args) {
        
        // Datos de identificación    
        String nombreApellido = "Daiana Arena";
        String dni = "38629115";
        String legajo = "VINF014686";
        System.out.println("Trabajo realizado por: " + nombreApellido + "- DNI: " + dni + "- LEGAJO: "+ legajo);

        Hash.main(args);
    
    }

    
    
}