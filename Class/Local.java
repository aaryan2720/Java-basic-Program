import java.util.Scanner;

class Local {
    
     static String name;
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){

            System.out.printf("Enter your name:");
            name = scan.next();
            System.out.println(name);
        }
        }
    
}
