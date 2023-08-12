package Algorithms.Search.Secuencial;

public class Secuencial {
     // Function for linear search
     public static int search(int arr[], int x)
     {
         int n = arr.length;
  
         // Traverse array arr[]
         for (int i = 0; i < n; i++) {
  
             // If element found then
             // return that index
             if (arr[i] == x)
                 return i;
         }
         return -1;
     }
}
