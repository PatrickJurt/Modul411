import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Factulty | " + faculty(5));
        System.out.println("Minimum  | " + findMinimum(new int[]{3, 5, 7, 8, 4, 39}));
        System.out.println("Merge    | " + Arrays.toString(mergeSort(new int[]{3, 6, 1, 4, 0, 11, 24, -2, 77})));
        System.out.println("Fibonacc | " + fibonacci(10));

    }

    public static int faculty(int i){
        return i* ((i > 1) ? (faculty(i - 1)) : 1);
    }


    public static int findMinimum(int[] ints){
        return (ints.length < 2) ? (ints[0]) : (Math.min(ints[ints.length-1], findMinimum(Arrays.copyOf(ints, ints.length-1))));
    }

    public static int fibonacci(int i){
        return (i <= 1) ? i : fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static int[] mergeSort(int[] ints){
        int[] firstHalf, secondHalf;
        if (ints.length > 1){
            firstHalf = mergeSort(Arrays.copyOfRange(ints, 0, ints.length/2));
            secondHalf = mergeSort(Arrays.copyOfRange(ints, ints.length/2, ints.length));
        }else{
            return ints;
        }

        int pointer1 = 0, pointer2 = 0;

        while (pointer1 < firstHalf.length || pointer2 < secondHalf.length){
            if (pointer1 >= firstHalf.length){
                ints[pointer1 + pointer2] = secondHalf[pointer2];
                pointer2++;
            }else if (pointer2 >= secondHalf.length){
                ints[pointer1 + pointer2] = firstHalf[pointer1];
                pointer1++;
            }else if (pointer1 >= firstHalf.length && pointer2 >= secondHalf.length){
                return ints;
            }else{
                if (firstHalf[pointer1] < secondHalf[pointer2]){
                    ints[pointer1 + pointer2] = firstHalf[pointer1];
                    pointer1++;
                }else{
                    ints[pointer1 + pointer2] = secondHalf[pointer2];
                    pointer2++;
                }
            }
        }
        return ints;
    }

}