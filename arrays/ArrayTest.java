package arrays;

public class ArrayTest {

    public static void main(String[] args) {
        CustomArray array = new CustomArray(3);
        array.insert(10);
        array.insert(20);
        array.insert(40);
        array.insert(30);
        array.print();
    }
    
}
