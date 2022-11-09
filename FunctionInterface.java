//Java Program used to illustrate function interface
//importing function interface
import java.util.function.Function;
public class FunctionInterface {
    public static void main(String[] args) {
        //function to divide a number by half and return it
        Function<Integer, Double> half = a -> a / 2.0;
        //applying the function to get the result.
        System.out.println(half.apply(20));
    }
}
