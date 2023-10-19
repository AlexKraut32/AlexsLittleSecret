package Alex_codingTasks.week4;

public class T2_SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetters("abcdefg", "hijklmn"));


    }


    public static boolean sameLetters(String str, String str2 ){

        boolean hasTheSameLetters = false;

        for(int i = 0; i < str.length(); i++){ // iterates through first string to check characters it contains

            for(int j = 0; j < str2.length(); j++){ // iterates through second string to check characters it contains

                if(str.charAt(i) == str2.charAt(i)){ // compares if first and second string have same letters but checking each charAt(i) value
                    hasTheSameLetters = true; // if both have same characters, reassign value for boolean result
                }
            }
        }
        return hasTheSameLetters;
    }

}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */
