package Alex_codingTasks.week4;

public class T1_frequencyOfChars {

    public static void main(String[] args) {

        System.out.println(frequencyOfCharsCounter("hellohello"));

    }

    public static String frequencyOfCharsCounter(String str){

        //String str = "ABBCCCDDDDEEEEEF";
        int frequencyCount = 0;
        String strAndCount = "";


        for (int i = 0; i < str.length(); i++) { // iterate through string

            char currentChar = str.charAt(i); // assigns the value of charAt(i) to currentChar

            for(int j = 0; j < str.length(); j++){ // iterate again to compare and find actual frequency

                char ch = str.charAt(j);

                if(currentChar == ch){ // compare first iteration to second iteration to begin counting same chars, if both are equal frequency will go up
                    frequencyCount++;
                }
            }

            if(strAndCount.contains(""+currentChar)){ // to ensure frequencyCount will stop after chars have been counted
                continue;
            }

            strAndCount += currentChar; // add chars back to new string
            strAndCount += frequencyCount + " "; // add frequencyCount to new string (added space to show chars with their count
        }

        return strAndCount;
    }


}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
