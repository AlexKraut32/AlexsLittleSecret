package Eugene_codingTasks.week04;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println("sameLetters(\"abc\", \"cab\") = " + sameLetters("abc" , "cab"));
    }

    public static boolean sameLetters(String str1, String str2) {
        boolean result=false;
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str2.contains("" + str1.charAt(i))) {
                count += i;
            }
            System.out.println(count+" "+str1.length());
            if (count == str1.length()) result = true;
        }
        return result;
    }
}