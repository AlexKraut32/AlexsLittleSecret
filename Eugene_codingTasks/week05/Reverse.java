package Eugene_codingTasks.week05;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
    }
    public static String reverse(String str){
        String stringResult="";
        for (int i = str.length()-1; i >= 0; i--) {
            stringResult+=str.charAt(i);
        }
        return stringResult;
    }
}

/*
Write a return method that can
 reverse String Ex: Reverse("ABCD"); ==> DCBA
 */