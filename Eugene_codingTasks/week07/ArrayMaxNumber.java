package Eugene_codingTasks.week07;

public class ArrayMaxNumber {

    public static void main(String[] args) {
        int[] numbers = {13, 88, 2, -31, 50, 666, 80};
        arrayMaxNumber(numbers);
    }

    public static void arrayMaxNumber(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }


}
