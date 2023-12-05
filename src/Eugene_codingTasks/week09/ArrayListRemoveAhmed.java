package Eugene_codingTasks.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAhmed {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        list.removeIf(p -> p.equals("Ahmed"));

        System.out.println(list);
    }
}
/*
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */