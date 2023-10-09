package Alex_codingTasks.week2;

public class T1_SwapNumbers {
    public static void main(String[] args) {


        int a = 5;
        int b = 10;

        System.out.println("Before swapping - a = " + a);
        System.out.println("Before swapping - b = " + b);

        b = b - a; // b = 10 - 5 --> 5
        a = b + b; //a = 5 + 5 --> 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }

}
/*
Swap two variables' value without using a third variable
 */


