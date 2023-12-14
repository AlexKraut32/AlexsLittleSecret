package Eugene_codingTasks.week09;
import java.util.Arrays;
public class ArrayConcatTwoArrays {

    public static void main(String[] args){
        int[] arr1 = {2,4,5,3,2};
        int[] arr2 = {6,7,8,9,10};
        twoConcatArrays(arr1,arr2);
    }
    public static void twoConcatArrays(int[] arr1, int[] arr2){
        int[] arrayResult = new int[10];
        for (int i = 0; i < arr1.length; i++) {
                arrayResult[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrayResult[i+arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(arrayResult));
    }


}
