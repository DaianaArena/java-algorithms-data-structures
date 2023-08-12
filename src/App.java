import Algorithms.Search.Binary.Binary;
import Algorithms.Search.Interpolation.Interpolation;
import Algorithms.Search.Secuencial.Secuencial;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Given arr[]
        int arr[] = { 2, 3, 4, 10, 40 };
 
        // Element to search
        int x = 10;
 
        // Function calls

            

            //Secuencial Search
            System.out.println("Secuencial search: ");
            int result = Secuencial.search(arr, x);

            if (result == -1) {
                System.out.print("Element is not present in array");
            } else {
                System.out.print("Element is present" + " at index " + result);
            }

            //Binary search
             System.out.println("Binary search: ");

             int orderArr[] = { 2, 3, 4, 10, 40 };
             int n = arr.length;
             
             
            
            int binary = Binary.binarySearch(orderArr, 0, n - 1, x);
 
            
            if (binary == -1){
                System.out.println("Element " + "not present");
            }else{
                    System.out.println("Element found" + " at index "  + result);
            }

            //Interpolation search
             System.out.println("Interpolation search: ");

             int[] A = {2, 5, 6, 8, 9, 10};
             int key = 5;
      
             int index = Interpolation.interpolationSearch(A, key);
      
             if (index != -1) {
                 System.out.println("Element found at index " + index);
             }
             else {
                 System.out.println("Element not found in the array");
             }

    }
}
