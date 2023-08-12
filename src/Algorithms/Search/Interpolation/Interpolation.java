package Algorithms.Search.Interpolation;

public class Interpolation {
    // Función para determinar si el objetivo existe en una array ordenada `A` o no
    // usando un algoritmo de búsqueda de interpolación
    public static int interpolationSearch(int[] A, int target)
    {
        // caso base
        if (A == null || A.length == 0) {
            return -1;
        }
 
        // el espacio de búsqueda es A[left…right]
        int left = 0;
        int right = A.length - 1;
 
        while (A[right] != A[left] && target >= A[left] && target <= A[right])
        {
            // estimar la mitad
            int mid = left + ((target - A[left])*(right - left)/(A[right] - A[left]));
 
            // se encuentra la clave
            if (target == A[mid]) {
                return mid;
            }
            // descartar todos los elementos en el espacio de búsqueda correcto, incluido el elemento central
            else if (target < A[mid]) {
                right = mid - 1;
            }
            // descartar todos los elementos en el espacio de búsqueda izquierdo, incluido el elemento central
            else {
                left = mid + 1;
            }
        }
 
        // si se encuentra la clave
        if (target == A[left]) {
            return left;
        }
 
        // el objetivo no existe en la array
        return -1;
    }
}
