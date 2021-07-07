import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1};

        Arrays.sort(arr);
        System.out.println("linearSearch: " + linearSearch(arr, 1));
        System.out.println("binarySearch: " + binarySearch(arr, 1, 0, arr.length-1));
    }

    public static int linearSearch(int[] arr, int item) {
        if (arr.length < 1) return -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == item) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int item, int low, int high) {
        if (arr.length < 1) return -1;
        int middle = (low+high)/2;
        if (arr[(middle)/2] > item){
            return binarySearch(arr, item, low, ((middle)/2)-1);
        }else if (arr[(middle)/2] < item){
            return binarySearch(arr, item, ((middle)/2) + 1, high);
        }
        else if (arr[(middle)/2] == item) {
            return (low + high) / 2;
        }else{
            return -1;
        }
    }
}
