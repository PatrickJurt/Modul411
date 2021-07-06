import java.util.Arrays;

public class Main {

    public static void main(String[] args){


        //arraysErstellen();

        moreArrays();
    }

    public static void arraysErstellen(){

        //Array erstellen mit Grösse 5 und default null-Werten
        int[] array1 = new int[5];

        //Array erstellen mit Grösse 5 und 5 Werten
        int[] array2 = new int[]{1,4,8,34,734};

        //2-dimensionales Array erstellen mit Grösse 54 x 3
        int[][] array3 = new int[54][3];
        array3[50][2] = 17;

        //6-dimensionales Array erstellen mit Grösse 2 x 3 x 4 x 5 x 6 x 7
        int[][][][][][] array4 = new int[2][3][4][5][6][7];

        //0-te Stelle ausgeben
        System.out.println(array1[0]);

        //Ganzes Array ausgeben
        System.out.println(Arrays.toString(array2));

        System.out.println(array3[50][2]);
    }



    public static void moreArrays(){

        //Array mit nicht-primitiven Datentypen
        Frucht apfel = new Frucht("apfel");
        Frucht birne = new Frucht("birne");
        Frucht pflaume = new Frucht("pflaume");
        Frucht[] fruchtarray= new Frucht[]{apfel, birne, pflaume};

        System.out.println(fruchtarray[1].name);

        //Arrays haben im Gegensatz zu ArrayLists eine feste Grösse, die nicht verändert werden kann.
        int[] aa = new int[]{1, 2, 3};
        int[] ab = new int[5];
        ab = Arrays.copyOfRange(aa, 0, 2);
        ab[3] = 4;
        ab[4] = 5;
        System.out.println(Arrays.toString(ab));

        //Array sind Referenzdatentypen.
        int[] a = new int[]{1, 2, 3};
        int[] b = a;
        b[2] = 7;
        System.out.println(Arrays.toString(a));
    }
}
