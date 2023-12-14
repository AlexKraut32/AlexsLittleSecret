package Eugene_codingTasks.week06;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("sumOfDigitsMethod(\"2365873254\") = " + sumOfDigitsMethod("2365873254"));
    }

    public static int sumOfDigitsMethod(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;

    }

}

