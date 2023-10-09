package Alex_codingTasks.week2;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_DivisibleBy3_5_15 {

    public static void main(String[] args) {

        ArrayList<Integer> divisibleBy3 = new ArrayList<>(); //If the number can be divisible by 3 but cannot be divisible by 15
        ArrayList<Integer> divisibleBy5 = new ArrayList<>(); //If the number can be divisible by 5 but cannot be divisible by 15
        ArrayList<Integer> divisbleBy15 = new ArrayList<>(); //If the number can be divisible by 3, 5, and 15

        for(int i = 1; i < 101; i++){ // iterate through numbers starting at 1 and ending at 100 (101 because it will stop 1 before indicated number, so will stop at 100)
            if(i % 3 == 0 && i % 15 != 0){
                divisibleBy3.add(i); // use add() method because we are dealing with arrayList
            }else if(i % 5 == 0 && i % 15 != 0){
                divisibleBy5.add(i);
            }else if(i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                divisbleBy15.add(i);
            }
        }

        System.out.println("divisibleBy3 = " + Arrays.asList(divisibleBy3));
        System.out.println("divisibleBy5 = " + Arrays.asList(divisibleBy5));
        System.out.println("divisibleBy15 = " + Arrays.asList(divisbleBy15));





    }

}
/*
Write a program that can print the numbers between 1~100 that can be divisible by 3, 5, and 15

    -If the number can be divisible by 3, 5, and 15, then it should only be displayed in DivisibleBy15 section
    -If the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3 section
    -If the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5 section
 */


