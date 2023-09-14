package Exercises.TP4.QuickSort;

public class QuickSort {

    // Datos de identificación    
        //nombreApellido = "Daiana Arena";
        //dni = "38629115";
        // legajo = "VINF014686";


    /* Esta función toma el último elemento como pivote,
    * coloca el elemento pivote en su posición correcta en la matriz
    ordenada
    * y coloca todos los elementos más pequeños (más pequeños que pivote)
    * a la izquierda del pivote y todos los elementos mayores a la derecha
    del pivote.
    */
    int particion(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1); // índice del elemento mas chico
        for (int j=low; j<high; j++)
        {
        // Si el elemento actual es mas chico o igual que el pivot
        if (arr[j] <= pivot)
        {
        i++;
        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
        }
        // Intercambia arr[i+1] y arr[high] (o pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
        }
        /* Método principal que implementa quicksort
        arr[] --> Array a ser ordenado,
        low --> Comienzo de indice,
        high --> Fin de indice */
        public void ordenar(int arr[], int low, int high){
            if (low < high) {
                // Encuentra el índice de partición
                int partitionIndex = particion(arr, low, high);
        
                // Ordena la parte izquierda del arreglo (elementos menores que el pivote)
                ordenar(arr, low, partitionIndex - 1);
        
                // Ordena la parte derecha del arreglo (elementos mayores que el pivote)
                ordenar(arr, partitionIndex + 1, high);
            }
        }
    
    

}
