package basic;

import java.util.Scanner;

public class sumOfArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        int sum = 0;

        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);
    }
    
}
