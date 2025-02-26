import java.lang.reflect.Array;

public class Main {

    // Create a generic method called printArrayContents(T[] array). Using this func on, print the
    //contents of any array passed to it.
    public static <T> void printArrayContents(T[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(i + " : " + array[i]);
        }
    }

    public static void main(String[] args) {

        Item<Integer> item = new Item<>(12);
        item.printItem();
        Item<String> itemString = new Item<>("This is a string");
        itemString.printItem();
        Item<Double> itemDouble = new Item<>(148.224);
        itemDouble.printItem();

        System.out.println();

        Integer[] intArray = {1,2,3};
        printArrayContents(intArray);
        String[] stringArray = {"new", "old", "young"};
        printArrayContents(stringArray);


    }
}