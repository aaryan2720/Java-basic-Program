import java.util.Scanner;
public class Two_d_array {
    public static void main(String[] args) {
       int[] arr1 = {12,13,45,47,50,51};
       Scanner sc = new Scanner(System.in);
       int k = sc.nextInt();
            for (int x:arr1) {
                if(k==x){
                    System.out.println(arr1[x]);
                }
            }
            }
}
            
