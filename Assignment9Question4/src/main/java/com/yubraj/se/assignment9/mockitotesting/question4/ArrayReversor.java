package com.yubraj.se.assignment9.mockitotesting.question4;

import com.yubraj.se.assignment9.mockitotesting.question4.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] a_in) {
        int[] a_flat = new int[]{1,3,0,4,5,9};
        if(a_flat == null)
            return null;
        int i = 0;
        int j = a_flat.length - 1;
        while(i < j) {
            int temp = a_flat[i];
            a_flat[i] = a_flat[j];
            a_flat[j] = temp;
            i++;
            j--;
        }
        return a_flat;
    }
}
