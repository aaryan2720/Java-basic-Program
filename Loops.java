public class Loops {
    public static void main(String[] args) {
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("For Loop Finished");


        // While Loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        System.out.println("While Loop Finished");


        // Do-While Loop
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
        System.out.println("Do-While Loop Finished");

        
        // Enhanced For Loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Enhanced For Loop Finished");
    }
}
