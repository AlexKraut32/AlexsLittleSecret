package Anna_JavaCodingTask.week2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        System.out.println("Divisible By 15");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible By 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible By 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

/*

 1. We use three separate loops to iterate through numbers from 1 to 100.
 2. In the first loop, we check if a number is divisible by 15 (both 3 and 5). If it is, we print it in the “Divisible By 15” section.
 3. In the second loop, we check if a number is divisible by 5 but not by 15 (not divisible by 3). If it meets these criteria, we print it in the “Divisible By 5” section.
 4. In the third loop, we check if a number is divisible by 3 but not by 15 (not divisible by 5). If it meets these criteria, we print it in the “Divisible By 3” section.
 */


