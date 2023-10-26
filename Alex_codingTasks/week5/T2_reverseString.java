package Alex_codingTasks.week5;

public class T2_reverseString {

    public static void main(String[] args) {

        System.out.println(reverse("Hello"));


    }

    public static String reverse(String str){
        String reverse = ""; // to contain all the characters of the given string in reverse

        for(int i = str.length() - 1; i >= 0; i--){ // i: index number of the given string starting from last index to index 0

            reverse += str.charAt(i); //to get each character of the string starting from last index to index 0
        }

        return reverse;
    }

}
