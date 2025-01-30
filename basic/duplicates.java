package basic;

//Find the first number which is duplicate in the given array
public class duplicates {
    public static void main(String[] args) {
        int[] array = {4,1,2,3,4,2,1,5};

        int duplicate = 0;
        
        outerLoop:
        for(int i = 0; i<array.length; i++) {
            for(int j = i+1; j<array.length; j++) {
                if(array[i] == array[j]) {
                    duplicate = array[i];
                    break outerLoop;
                }
            }
        }
        System.out.println("Duplicate number: "+duplicate);
    }
}
