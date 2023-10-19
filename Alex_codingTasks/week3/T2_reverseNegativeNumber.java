package Alex_codingTasks.week3;

public class T2_reverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-5));

    }

    public static int reverseNegative(int num){

        int positiveNumber = num * (-1);

        return positiveNumber;

    }

}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */