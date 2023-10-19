package Eugene_codingTasks.week04;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));
    }

    public static String frequencyOfCharacters(String str) {
        int result = 0;
        String resultString = "";

        for (char i = 0; i < str.length(); i++) {
            result = 0;
            for (char j = i; j < str.length(); j++) {
                String ch = "" + str.charAt(i);
                if (ch.equals("" + str.charAt(j))) {
                    result += 1;
                }
            }
            if (!resultString.contains("" + str.charAt(i))) {
                resultString += "" + str.charAt(i) + result;
            }
        }
        return resultString;
    }
}
