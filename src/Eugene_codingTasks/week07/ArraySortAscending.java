package Eugene_codingTasks.week07;

import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {


        int[] arr = new int[]{10, 9, 8, 7};
        sort(arr);
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temporary = 0;
                if (arr[i] > arr[j]) {
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
