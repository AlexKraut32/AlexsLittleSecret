package Eugene_codingTasks.week03;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 151;
        boolean prime = true;
        if (num==1){
            prime = false;
        }else if (num == 2||num==3||num==5||num==7) {
            prime = true;
        } else {
            for (int i = 2; i <= 9; i++) {
                if (num % i == 0) {
                    prime = false;
                }
            }
        }
        System.out.println(num + " is a Prime number? " + prime);
    }
}
//The steps involved in finding prime numbers using the factorization method are:
//
//Step 1: First let us find the factors of the given number( factors are the number which completely divides the given number)
//
//Step 2: Then check the total number of factors of that number
//
//Step 3: Hence, If the total number of factors is more than two, it is not a prime number but a composite number.

