package Exercises.TP3.src.Hash;


public class Hash {
   
     /* Datos de identificación    
    Nombre Apellido = "Daiana Arena"
    DNI = "38629115"
    Legajo = "VINF014686"
    */
    
    int dato;
    int estado; //0 = Vacío, 1 = Eliminado, 2 = Ocupado
    static int FuncionHash(int n, int m) {
    //n es el valor original
    //m es el tamaño de la tabla
    // y debe devolver una posición int dentro del tamaño m
    return n % m;
    }
    static void insertaHash(Hash[] h, int m, int n) {
    boolean i = false;
    int j = FuncionHash(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
            
                h[j].dato = n;
                h[j].estado = 2;
                i = true;
            } else {
            j++;
        }
        } while (j < m && !i);

        if (i) {
            System.out.print ("Elemento insertado con Éxito en la siguiente posición: "+ j  + " \n");
        } else {
            System.out.print ("Tabla llena!!! \\n");
        }
    }
    static int buscaHash(Hash[] h, int m, int n) {
        // Comenzar en el índice obtenido mediante la función de hash
        int j = FuncionHash(n, m);
        do {
            // Si el elemento se encuentra
            if (h[j].estado == 2 && h[j].dato == n) {
                System.out.print ("Elemento encontrado con Éxito! \n");
                ;
                return j; // Devolver la posición donde se encontró el elemento
            }
            j++;
        } while (j < m);
        // Si el elemento no se encuentra en la tabla hash
        System.out.println("Elemento no encontrado, ocurrió un error. \n");
        return -1; // Devolver -1 para indicar que no se encontró el elemento
    }
    static int eliminaHash(Hash[] h, int m, int n) {
    int i = buscaHash(h, m, n);
    if (i == -1) {
    return -1;
    } else {
    h[i].estado = 1;
    System.out.print ("Elemento Borrado! \n");
    return 1;
    }
    }
    

    
    public static void main(String[] args) {
        int i, n,elemento;
        // Tabla Definida de 15
        int m=15;
        Hash[] h = new Hash[m];
        for (i = 0; i < m; i++) {
        h[i] = new Hash();
        h[i].estado = 0;
        }
        // Insertar elemento
        Hash.insertaHash(h, m, 15);
        Hash.insertaHash(h, m, 130);
        Hash.insertaHash(h, m, 7);
        Hash.insertaHash(h, m, 32);
        //Buscando un elemento
        elemento=7;
        i = Hash.buscaHash(h, m, elemento);
        System.out.print ("Elemento encontrado en la posición: " + i + "\n");
        i = Hash.eliminaHash(h, m, 130);
        System.out.print ("Elemento eliminado de la posición: " + i + "\n");
    }
    
}
