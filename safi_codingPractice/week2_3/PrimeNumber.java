package safi_codingPractice;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime1(7));
        System.out.println(isPrime1(16));
        isPrime(13);
        isPrime(18);
    }


    public static String isPrime(int n) {
        String primeNum = "";
        String notPrime ="";
        for (int i = 2; i < n;i++) {
            if (!(n % i == 0)) {
                primeNum += n;
                System.out.println(primeNum+ " is a prime number");
                break;

            }else{
                notPrime+=n;
                System.out.println( notPrime+ " is not a prime number");
                break;
            }
        }
return primeNum;
    }

    public static boolean isPrime1(int num){
        for (int i = 2; i < num; i++) {
            if(num % i==0){
                return false;
            }else{
                return true;

            }

        }
        return true;
    }
}

