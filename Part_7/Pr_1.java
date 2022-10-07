// Create a generic method for sorting an array of Comparable objects.

// ********************** Neel Goyani (21CE036) ***********************

import java.util.*;

public class Pr_1 {
    public <E extends Comparable<E>> void sort(E[] ar){
        E swap;
    
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i].compareTo(ar[j]) > 0) {
                    swap = ar[i];
                    ar[i] = ar[j];
                    ar[j] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        Pr_1 t = new Pr_1();

        Integer[] arr = {3,4,1,2,5};
        t.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] countries = {"Zimbabwe", "SouthAfrica", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
        t.sort(countries);
        // for (int i = 0; i < countries.length; i++) {
        //     System.out.println(countries[i]);
        // }
        System.out.println(Arrays.toString(countries));
    }    
}