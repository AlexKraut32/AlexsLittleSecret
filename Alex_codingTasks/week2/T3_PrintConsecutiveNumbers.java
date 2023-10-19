package Alex_codingTasks.week2;

public class T3_PrintConsecutiveNumbers {
    public static void main(String[] args) {

        printConsecutiveNumbers(60);


    }

    public static void printConsecutiveNumbers(int num){


        for(int i = 1; i < num; i++){

            String str = "";

            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0) { // if number is NOT divisible by 2 3 or 5 , print just the number

                if (i % 2 == 0) {
                    str += "Codility";
                }
                if (i % 3 == 0) {
                    str += "Test";
                }
                if (i % 5 == 0) {
                    str += "Coders";
                }
            }else{
                str += "" + i;
            }
            System.out.println(str + "\n");

        }
    }

}

/*
Write a function that:
    Given a positive integer N, print the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2, 3 or 5 it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2, 3 and 5, should be replaced by CodilityTestCoders.

    2 = Codility
    3 = Test
    5 = Coders

 */


