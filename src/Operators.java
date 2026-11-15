public class Operators {
    public static void main (String[]args){

       //Arithmetic operators

        int x = 10;
        int y = 3;
        int z;

        //z = x + y;
        //z = x * y;
        //z = x - y;
        //z = x % y;
        //System.out.println(z);

        //Augmented Assignment operators

        int x = 10;
        int y = 3;
        //Adding x and y but storing it in x
        //x = x + y; // is same as x += y;
        //x -= y;
        // x *= y;
        System.out.println(x);


        //Increment and Decrement Operators


        int x = 1;
        x = x + 1; // or x++; , x++;

        int x = 2;
        x = x-2; //or x--; x--;

        System.out.println(x);



        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5)/2.0;

        System.out.println(result);








    }

}
