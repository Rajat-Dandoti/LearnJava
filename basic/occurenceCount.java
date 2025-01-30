package basic;

import java.util.Scanner;

public class occurenceCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] array = new int[n];

        for (int i = 0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        int count = 0;
        int element = scan.nextInt();

        scan.close();

        for (int i = 0; i<array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
