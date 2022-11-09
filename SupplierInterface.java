import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        //this function return a random values
        Supplier<Double> randomValue = () -> Math.random();
        //print the random value using get()
        System.out.println(randomValue.get());
    }
}
