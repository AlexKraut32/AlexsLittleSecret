package Anna_JavaCodingTask.week2;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping - a: " + a + ", b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping - a: " + a + ", b: " + b);
    }
}
/* Before swapping - a: 5, b: 10
After swapping - a: 10, b: 5
 */

/*
Swap two variables' value without using a third variable
 */
