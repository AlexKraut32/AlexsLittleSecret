package Eugene_codingTasks.week01;

public class NumbersOddEven {

    public static void numMeth(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        numMeth(99);
    }

}
