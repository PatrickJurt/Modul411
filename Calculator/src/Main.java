import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to do?");
        System.out.println("1. You Want... Sum Fak?");
        System.out.println("2. You Want... Min Max");
        System.out.println("3. Runtimetest");

        int input = scanner.nextInt();

        if (input == 1){
            System.out.println("Enter a number.");
            System.out.println(sumfak(scanner.nextInt()));
        }else if (input == 2){
            System.out.println("How many numbers?");
            int size = scanner.nextInt();
            int[] numbers = new int[size];

            for (int i = 0; i < numbers.length; i++){
                numbers[i] = scanner.nextInt();
            }

            System.out.println(minmax(numbers));
        }else if (input == 3){
            runtimetest();
        }

    }

    public static String sumfak(int in){
        if (in < 1) {
            return "Please give positive input.";
        }else if (in > 20){
            return "Input too big.";
        }else{
            long fak = 1;
            long sum = 0;
            for (int i = 1; i <= in; i++) {
                fak *= i;
                sum += i;
            }
            return "Fakultät: " + fak + " || Summe: " + sum;
        }
    }

    public static String minmax(int[] numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : numbers) {
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }

        return "Max : " + max + " || " + min;
    }

    public static void runtimetest(){
        System.out.println("Fakultät");
        for (int i = 1; i <= 20; i++){

            long time1 = System.currentTimeMillis();
            long fak = 1;
            for (int j = 1; j <= i; j++){
                fak *= j;
            }
            long time2 = System.currentTimeMillis();
            System.out.println(i + " " + fak + " time: " + (time2 - time1));
        }

        System.out.println();
        System.out.println("Summe");
        int timesum = 0;
        for (int i = 1; i <= 200000; i++){

            long time1 = System.currentTimeMillis();
            long sum = 0;
            for (int j = 1; j <= i; j++){
                sum += j;
            }
            long time2 = System.currentTimeMillis();
            long diff = time2 - time1;
            timesum += diff;
            System.out.println(i + " " + sum + " time: " + diff);
        }
        System.out.println(timesum);
    }
}
