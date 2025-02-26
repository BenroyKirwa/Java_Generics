package datahandler;

public class IntegerHandler implements DataHandler<Integer> {
    @Override
    public void processData(Integer data) {
        // Return reciprocal (1/n)
        double output = 1.0/data;
        System.out.println(output);
    }
}
