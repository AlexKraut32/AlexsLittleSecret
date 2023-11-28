package Eugene_codingTasks.week08;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 0, 6, 0, 4, 0, 2, 1};
        for (int i = 0; i < arr.length; i++) { //iterating through every index
            if (arr[i] == 0) { //if i ==0
                for (int j = arr.length - 1; j > i; j--) { //iterating from back of the array to the front till index i
                    if (arr[j] != 0) { // if index from the back is not '0' it means we have what to swap
                        arr[i] = arr[j]; //switching between i and j
                        arr[j] = 0;
                        break; //jumping out of the inner loop
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
 */