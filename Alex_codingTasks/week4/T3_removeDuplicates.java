package Alex_codingTasks.week4;

public class T3_removeDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!str.substring(i + 1).contains("" + str.charAt(i))) { // if str index of i + 1 does NOT contain str char at i from iteration,
                result += "" + str.charAt(i); //char will be added to new string , if it does contain it will skip to next

            }

        }
        return result;
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */


