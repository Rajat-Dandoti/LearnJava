package basic;

import java.util.Arrays;
import java.util.Scanner;

public class arraySortBuiltIn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(array);
    }
    
}
