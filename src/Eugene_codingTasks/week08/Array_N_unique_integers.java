package Eugene_codingTasks.week08;

import java.util.Arrays;

public class Array_N_unique_integers {
    public static int[] sumZero(int n) { //n=4 or 5
        int d = -(n / 2); //d=-2
        int[] arr = new int[n];
        if (n % 2 != 0) { //if reminder is not 0
            for (int i = 0; i < n; i++) { //n=5, d=-2
                arr[i] = d; //0 index=-2, 1 index=-1, 2 index=0, 3 index = 1, 4 index = 2
                d = d + 1;
            }
        } else { //if reminder is 0
            for (int i = 0; i < n; i++) { //n=4, d=-2
                if (d == 0) { //if n is odd we need '0' to fill middle index in our array
                    d = d + 1; //if d=0 we add 1 to d
                }
                arr[i] = d; //0 index=-2, 1 index=-1, 2 index=1, 3 index = 2
                d = d + 1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }
}


/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array
containing N unique integers that sum up to 0. The function can return any
such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more
correct answers).
 */
