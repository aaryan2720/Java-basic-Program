import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.printf("HI %s, how old are you ? ", name);
            int age = Integer.parseInt(scanner.nextLine());
            System.out.printf("ohhh %d is excellent to start programming, whats you percentage in 12th? ", age);
            float percent = scanner.nextFloat();
            scanner.nextLine();
            System.out.printf("hmmmm %f is good, which language do you prefer? ", percent);
            String language = scanner.nextLine();
            System.out.printf("%s is a good language lets start,Btw whats is your hobby? ",language);
            String hobby = scanner.nextLine();
            System.out.printf("hmmmm %s is a good hobby lets start coding,lets start",hobby);
        }

    }
}
