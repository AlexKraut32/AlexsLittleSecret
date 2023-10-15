package safi_codingPractice;



public class ReverseNegativeNumber {
    public static void main(String[] args) {
       reverseNeg(-531);
    }

    public static int reverseNeg(int n){

        int reverse = 0;
        while (n <0){
            reverse =reverse *10+ n % 10;
            n = n /10;
        }
        System.out.println("Reverse number is :"+ reverse);
        return reverse;
    }
}
