package basic;

import java.util.Scanner;

public class maxInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = scan.nextInt();

        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        findMax(array);
    }
    
    public static void findMax(int[] array) {
        int max = array[0];

        for(int i=0; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number in the given array: "+max);
    }
}
