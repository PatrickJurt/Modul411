import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Gegenstand a = new Gegenstand("A", 4.5);
        Gegenstand b = new Gegenstand("B", 1.0);
        Gegenstand c = new Gegenstand("C", 5.5);
        Gegenstand d = new Gegenstand("D", 7.0);
        Gegenstand e = new Gegenstand("E", 3.5);
        Gegenstand f = new Gegenstand("F", 6.0);

        Gegenstand[] gegenstands = new Gegenstand[]{a, b, c, d, e, f};

        Gegenstand[] result = notgreed(gegenstands, 20.0);
        if (result != null){
            System.out.println(Arrays.toString(result));
        }else{
            System.out.println("Doesn't work.");
        }


        result = greed(gegenstands, 20.0);
        if (result != null){
            System.out.println(Arrays.toString(result));
        }else{
            System.out.println("Doesn't work.");
        }
    }

    public static Gegenstand[] greed(Gegenstand[] gegenstands, double limit){

        Arrays.sort(gegenstands);
        Gegenstand[] result = new Gegenstand[gegenstands.length];
        double sum = 0;
        int resultIndex = 0;

        for (int i = gegenstands.length-1; i >= 0; i--){
            if (sum + gegenstands[i].getGewicht() <= limit){
                sum += gegenstands[i].getGewicht();
                result[resultIndex++] = gegenstands[i];
            }
        }

        return result;
    }


    public static Gegenstand[] notgreed(Gegenstand[] gegenstands, double limit){

        Arrays.sort(gegenstands);
        Gegenstand[] result;
        Gegenstand[] bestresult = null;
        double bestsum = 0;

        for (int i = gegenstands.length-1; i >= 0; i--){
            result = new Gegenstand[gegenstands.length];
            int resultIndex = 0;

            double sum = gegenstands[i].getGewicht();
            result[resultIndex] = gegenstands[i];
            resultIndex++;

            for (int pointer = i-1; sum <= limit && pointer >= 0; pointer--){
                if (sum + gegenstands[pointer].getGewicht() <= limit){
                    result[resultIndex] = gegenstands[pointer];
                    resultIndex++;
                    sum += gegenstands[pointer].getGewicht();
                }
            }
            if (sum > bestsum){
                if (sum == limit){
                    return result;
                }
                bestresult = result;
                bestsum = sum;
            }
        }
        return bestresult;
    }
}
