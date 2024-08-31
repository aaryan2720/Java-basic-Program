import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");
        fruitList.add("Elderberry");

        if (!fruitList.isEmpty()) {
            System.out.println(fruitList.get(2));
        } else {
            System.out.println("The list is empty.");
        }
    }
}