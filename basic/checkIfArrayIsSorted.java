package basic;

import java.util.Scanner;

public class checkIfArrayIsSorted {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        ifArrayIsSorted(array);
    }

    public static void ifArrayIsSorted(int[] array) {

        boolean isSortedAscending = true;
        boolean isSortedDescending = true;

        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[j] < array[i]) {
                    isSortedAscending = false;
                }
                if(array[j] > array[i]) {
                    isSortedDescending = false;
                }
            }
        }
        if(isSortedAscending) {
            System.out.println("Array is sorted in ascending order");
        } else if(isSortedDescending) {
            System.out.println("Array is sorted in descending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
    
}
