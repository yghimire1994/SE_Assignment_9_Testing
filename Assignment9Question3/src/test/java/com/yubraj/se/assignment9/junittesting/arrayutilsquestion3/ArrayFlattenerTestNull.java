package com.yubraj.se.assignment9.junittesting.arrayutilsquestion3;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ArrayFlattenerTestNull {

    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @Test
    public final void testFlattenArray() {
        int[][] a_input = null;
        Integer[] a_output = arrayFlattener.flattenArray(a_input);
        Integer[] expected_output = null;
        boolean areArraysEqual = Arrays.equals(a_output, expected_output);
        assertTrue(areArraysEqual);
    }

    @Test
    public final void testFlattenArrays() {
        int[][] a_input = null;
        int[] a_output = arrayFlattener.flattenArrays(a_input);
        int[] expected_output = null;
        boolean areArraysEqual = Arrays.equals(a_output, expected_output);
        assertTrue(areArraysEqual);
    }
}
