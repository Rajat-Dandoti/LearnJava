package basic;

import java.util.Scanner;

class reverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        String reversed = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            reversed = ch + reversed; 
        }
      
        System.out.println(reversed);
    }
}