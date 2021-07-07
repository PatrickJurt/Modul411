package pseudocode;

public class PseudoCode {

    //Author: Patrick Jurt
    //Date:   07.07.2021

    public static void main(String[] args) {

        function(0);

    }


    //This method divides a number by 2 until the result reaches 1.
    //Everytime the result is odd, it adds 1 to e.
    //Returns e.
    public static int function(int n){
        if (n == 1) return 1;
        if (n == 0) return 0;

        //Divide n until n = 1 or n = 0
        int e = function(n / 2);

        //If n is odd, add 1 to e.
        e = e + (n % 2);
        return e;
    }

}
