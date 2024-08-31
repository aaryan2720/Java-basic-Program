import java.util.ArrayList;
;
public class ArrlisExample2 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("Before: "+ numbers.toString());

        numbers.forEach(number ->{
            numbers.set(numbers.indexOf(number), number * 2);
        });

        System.out.println("after: "+ numbers.toString());
        
    }
}
