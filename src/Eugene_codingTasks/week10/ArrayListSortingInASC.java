package Eugene_codingTasks.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListSortingInASC {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(100, 2, 58, 67, 8, 65, 2, 41));
        arrayListSortingInASC(arr);
    }

    public static void arrayListSortingInASC(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i) && j > i) { //checking if j<i move j back and j should start from index i
                    int temp= arr.get(i);               //temporary store variable at index i
                    arr.set(i, arr.get(j));             //moving variable at index j to index i
                    arr.set(j,temp);                    //assigning temp variable to index j
                }
            }
        }
        System.out.println(arr);
                }

    }









/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using
the sort method.
 */