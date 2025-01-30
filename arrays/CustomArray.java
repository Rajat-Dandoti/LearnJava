package arrays;

public class CustomArray {

    private Object[] items;
    private int count;

    public CustomArray(int length) {
        items = new Object[length];
    }

    public void print() {
        for(int i=0; i<count; i++)
            System.out.println(items[i]);
    }

    public void insert(Object item) {
        if(items.length == count) {
            System.out.println("Array size exceeded");
            Object[] newItems = new Object[count * 2];
            for (int i=0; i<count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {

    }

    public void indexOf(Object x) {

    }
    
}
