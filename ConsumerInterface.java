//Java program to demonstrate consumer interface
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerInterface {
    public static void main(String[] args) {
        //Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);
        //Implement display using accept
        display.accept(10);
        //Consumer to multiply every element of the list to 2
        Consumer<List<Integer>> modify = list ->{
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2*list.get(i));
        };
        //Consumer to display a list of numbers
        Consumer<List<Integer>>
                dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));
        List <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(9);

        modify.accept(list);
        dispList.accept(list);
    }
}
