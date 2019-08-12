package com.yubraj.se.assignment9.junittesting.arrayutilsquestion3;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener = null;

    @Before
    public void setUp() throws Exception {
        this.arrayFlattener = new ArrayFlattener();
    }

    @After
    public void tearDown() throws Exception {
        this.arrayFlattener = null;
    }

    @Test
    public void testFlattenArray() {
        int[][] a_input = { {1,3}, {0}, {4,5,9} };
        Integer[] a_output = arrayFlattener.flattenArray(a_input);
        Integer[] expected_output = { 1, 3, 0, 4, 5, 9 };
        boolean areArraysEqual = Arrays.equals(a_output, expected_output);
        assertTrue(areArraysEqual);
    }

    @Test
    public void testFlattenArray2() {
        int[][] a_input = { {1,3}, {0}, {4,5,9} };
        int[] a_out = arrayFlattener.flattenArrays(a_input);
        int[] expected_a_out = { 1, 3, 0, 4, 5, 9 };
        boolean areArraysEqual = Arrays.equals(a_out, expected_a_out);
        assertTrue(areArraysEqual);
    }

}

