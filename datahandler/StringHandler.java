package datahandler;

public class StringHandler implements DataHandler<String> {
    @Override
    public void processData(String data) {
        // Create a reversed string
        StringBuilder reversed = new StringBuilder(data).reverse();

        // Convert to uppercase
        String upper = reversed.toString().toUpperCase();
        System.out.println(upper);
    }
}