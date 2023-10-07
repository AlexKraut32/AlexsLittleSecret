package Eugene_codingTasks.week01;

public class DivideWithoutOperator {
    public static void devideMethod(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Number '0' entered, is mot allowed");
        }
        System.out.print(num1 + " devided by " + num2 + " is: ");
        int result = 0;
        while (num1 >= num2) {
            num1 -= num2;
            result++;
        }
        System.out.println(result + " and remainder is " + num1);
    }

    public static void main(String[] args) {
        devideMethod(25, 4);
    }
}
