package basic;

import java.util.Scanner;

public class arraySort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        scan.close();
        sort(array);
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i<array.length - 1; i++) {
            int minIndex = i;
            for(int j = i+1; j<array.length; j++){
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.print("Sorted array: ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
