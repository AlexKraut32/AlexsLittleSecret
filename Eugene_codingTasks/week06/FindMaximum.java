package Eugene_codingTasks.week06;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("findMaximumMethod(new int[] {2, 5, 6, 8, 3, 2, 5}) = " + findMaximumMethod(new int[]{2, 5, 6, 8, 3, 2, 5}));
    }

    public static int findMaximumMethod(int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
return max;
    }


}
