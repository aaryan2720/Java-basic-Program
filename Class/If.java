import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            n = sc.nextInt();
            if(n>=1 && n<=100){
            if (n % 2 == 0 && n > 1 || n < 6) {
                System.out.println("Not Weird");
            }
            if (n % 2 != 0) {
                System.out.println("Weird");
            }
            if (n % 2 == 0 && n > 5 || n < 21) {
                System.out.println("Weird");
            }
            if (n % 2 == 0 && n > 20 && n<100) {
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Invalid input");
        }



        }
    }
}
