import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie gross soll die Raute sein.");

        int width = scanner.nextInt();

        StringBuilder s = new StringBuilder();

        System.out.println(buildStar(s, width));

    }

    public static StringBuilder buildStar(StringBuilder s, int width){

        s = singleStar(s, width);

        s = expandingStar(s, width);

        s = compressingStar(s, width);

        s = singleStar(s, width);

        return s;
    }

    public static StringBuilder singleStar(StringBuilder s, int width){

        for(int i = 0; i < width - 1; i++){
            s.append(" ");
        }
        return s.append("* \r\n");
    }

    public static StringBuilder expandingStar(StringBuilder s, int width){
        for(int i = 1; i < width; i++){
            for (int j = 1; j < width - i; j++){
                s.append(" ");
            }
            s.append("*");
            for (int j = 0; j < i*2 - 1; j++){
                s.append(" ");
            }
            s.append("*");
            s.append("\r\n");
        }
        return s;
    }

    public static StringBuilder compressingStar(StringBuilder s, int width){


        for (int i = width - 1; i > 1; i--){
            for (int j = width - i; j > 0; j--){
                s.append(" ");
            }
            s.append("*");
            for (int j = i*2 - 1; j > 2 ; j--){
                s.append(" ");
            }
            s.append("*");
            s.append("\r\n");
        }
        return s;
    }
}
