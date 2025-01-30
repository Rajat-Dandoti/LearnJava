package basic;

import java.util.Scanner;

public class sumOfAllDigits {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        scan.close();
        solution(num);
    }

    public static void solution(int num) {
        int sum = 0;
        while(num>0) {
            sum = sum + num%10;
            num = num/10;
        }

        System.out.println("Sum of all digits: "+sum);

    }

}
