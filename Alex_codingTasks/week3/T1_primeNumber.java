package Alex_codingTasks.week3;

public class T1_primeNumber {

    public static void main(String[] args) {

        isPrime(3);

    }

    public static void isPrime(double num){

        if(num > 0 && num % 2 != 0){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }


}
 /*
    1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */