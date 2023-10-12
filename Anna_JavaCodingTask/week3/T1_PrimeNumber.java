package Anna_JavaCodingTask.week3;

public class T1_PrimeNumber {
    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
    }
/*The solution uses a simple approach to determine if a number is prime. By iterating from 2 to num/2 and checking for divisibility, we can ascertain whether a number has factors other than 1 and itself. If it does, it's not prime; if it doesn't, it's prime.  */
