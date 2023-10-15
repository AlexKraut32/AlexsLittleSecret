package safi_codingPractice.week4;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetter("abc","cab"));
    }



    public static boolean sameLetter(String str1, String str2 ){

     String s1 = str1.replace(" ", ""); // taking care of empty spaces
     String s2 = str2.replace(" ","");

     if(s1.length()!=s2.length()){
         return false;
     }else {
        char c1[] = s1.toLowerCase().toCharArray(); //converting to char array and taking care of case sensitive
        char c2[] = s2.toLowerCase().toCharArray();

         Arrays.sort(c1); // sorting array
         Arrays.sort(c2);
         return Arrays.equals(c1,c2); // return true if both are the same characters
     }
    }
}
