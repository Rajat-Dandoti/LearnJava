package basic;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        scanner.close();
        reverseGivenArray(array);
    }

    public static void reverseGivenArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            reversedArray[i] = array[array.length-1-i];
        }

        System.out.print("Reversed array: ");
        for(int i = 0; i<array.length; i++){
            System.out.print(reversedArray[i]+" ");
        }
    }
}
