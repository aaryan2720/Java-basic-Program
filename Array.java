import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        char array[]  = {'i','e','o','a','u'};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

// Sorting and unsorting of array - use Array.sort(Arrayname);
// If you want to keep some elements away from sorting - declare no. of integer,startingIndex,endingindex
//Binary search operates on only sorted array 
//Array.fill(arrayname,'your elemernt');
//Array.sort(arrayname);
