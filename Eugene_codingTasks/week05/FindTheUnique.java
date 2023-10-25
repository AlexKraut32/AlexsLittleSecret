package Eugene_codingTasks.week05;
public class FindTheUnique {
    public static void main(String[] args) {
        System.out.println("findTheUnique(\"AAABBBCCCDEF\") = " + findTheUnique("AAABBBCCCDEF"));
    }
    public static String findTheUnique(String str) {
        String resultString = "";
        for (char i = 0; i < str.length(); i++) {
            if (!resultString.contains("" + str.charAt(i))) {
                resultString += "" + str.charAt(i);
            }
        }
        return resultString;
    }
}

/*
Write a return method that can find the unique characters
 from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
