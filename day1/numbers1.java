package day1;
import java.util.Scanner;

public class numbers1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        loop(n);
        scan.close();
    }
    
    public static void loop(int num) {
        if(num%2 != 0) {
            System.out.println("Weird");
        }
        else if(num>=2 && num<=5 && num%2==0) {
            System.out.println("Not Weird");
        }
        else if(num>=6 && num<=20 && num%2==0) {
            System.out.println("Weird");
        }
        else if(num>20 && num%2 == 0) {
            System.out.println("Not Weird");
        }
    }
}
