package Exercises.TP3;

import Exercises.TP3.src.Hash.Hash;

public class App {

    public static void main(String[] args) {
        
        // Datos de identificación    
        String nombreApellido = "Daiana Arena";
        String dni = "38629115";
        String legajo = "VINF014686";
        System.out.println("Trabajo realizado por: " + nombreApellido + "- DNI: " + dni + "- LEGAJO: "+ legajo);

        
        // Agregar elementos a los HashMaps
        System.out.println("rta");
        System.out.println(Hash.FuncionHash(1, 10));


         // Buscar elementos en los HashMaps
         
         
         //TO DO: chequear si funciona el buscador, ver la clase grabada, cambiar a static (no public!) todo el archivo hash, los metodos y atributos
    }

    
    
}