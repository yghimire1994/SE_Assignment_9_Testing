package com.yubraj.se.assignment9.junittesting.arrayutilsquestion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {
    public Integer[] flattenArray(int[][] a_input) {
        if (a_input == null)
            return null;
        List<Integer> listofArray = new ArrayList<>();
        for (int[] arrays : a_input) {
            for (int a : arrays) {
                listofArray.add(a);
            }
        }
        return (Integer[]) listofArray.toArray(new Integer[listofArray.size()]);
    }
    public int[] flattenArrays(int[][] a_input) {
        if (a_input == null)
            return null;
        return Arrays.stream(a_input)
                .flatMapToInt(arrays -> Arrays.stream(arrays))
                .toArray();
    }
}

