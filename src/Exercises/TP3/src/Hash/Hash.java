package Exercises.TP3.src.Hash;

import java.util.HashMap;

public class Hash {
   
     /* Datos de identificación    
    Nombre Apellido = "Daiana Arena"
    DNI = "38629115"
    Legajo = "VINF014686"
    */
    
     // HashMap para almacenar pares clave-valor
     private static HashMap<Integer, Integer> hashMap = new HashMap<>();

     // Constructor
     public Hash() {
         // Constructor vacío
     }

    //En los siguientes métodos "n" es la clave y "m" el valor

    // Método para añadir un elemento al HashMap
    public static int FuncionHash(int n, int m) {
        Integer h = hashMap.put(n, m);
        if (h == null) {
            return 1;  // se creo correctamente
        }
        return -1;        // No se proporcionó una instancia válida de Hash
    }

    // Método para buscar un elemento en el HashMap, devuelve default si hay un error
    public static int buscaHash(Hash[] h, int n, int m) {
        // Chequear si efectivamente esa key se corresponde a ese value o devolver -1
        if (h == null || h.length == 0) {
            return -1; // No se proporcionó una instancia válida de Hash
        }

        for (Hash instancia : h) {
            if (instancia != null) {
                Integer valor = hashMap.get(n);
                if (valor != null && valor == m) {
                    return 1; // Clave encontrada con el valor correspondiente
                }
            }
        }

        return -1; // No se encontró la clave o el valor no coincidió
    }
}
