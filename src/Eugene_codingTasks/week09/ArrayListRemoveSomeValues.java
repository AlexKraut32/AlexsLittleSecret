package Eugene_codingTasks.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 100, 101, 102, 103));
        list.removeIf(p -> p > 100);
        System.out.println(list);
    }
}
/*
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */