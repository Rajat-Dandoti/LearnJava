package basic;

import java.util.Scanner;

public class minInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        scan.close();

        findMin(array);
    }

    public static void findMin(int[] array) {
        int min = array[0];

        for(int i = 0; i<array.length; i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("Min number in the given array: " + min);
    }
}
