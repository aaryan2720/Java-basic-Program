import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));
    }
}

//for comparing of two diffrent arrays although they are same we should use .equals method