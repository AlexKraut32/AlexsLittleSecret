package Alex_codingTasks.week1;

public class T3_FINRA {
    public static void main(String[] args) {

        finra();

    }

    public static void finra(){

        for(int i = 1; i < 31; i++){ //for loop that will start at 1 and go until 30

            if(i % 3 == 0){ // if (i) is divisible by 3 with no remainder

                System.out.print(" FIN ");

            }else if(i % 5 == 0){ // if (i) is divisible by 5 with no remainder

                System.out.print(" RA ");

            }else if(i % 3 == 0 && i % 5 == 0){ // if (i) is divisible by 3 and 5 with no remainder

                System.out.print(" FINRA ");

            }else{ //all other numbers that are not divisible by 3 or 5

                System.out.print(i + " "); //prints out (i) with space, on single line
            }
        }

    }

}
/*

Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number. For numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 AND 4, print "FINRA" instead of the number.

 */

