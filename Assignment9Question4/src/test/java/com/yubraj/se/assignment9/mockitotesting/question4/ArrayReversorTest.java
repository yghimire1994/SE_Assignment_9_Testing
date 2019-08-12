package com.yubraj.se.assignment9.mockitotesting.question4;



import com.yubraj.se.assignment9.mockitotesting.question4.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorTest {
    private ArrayReversor arrayReversor;

    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor = null;
    }

    @Test
    public void testReverseArray() {
        int[][] a_input = new int[][]{{1,3}, {0}, {4,5,9}};
        when(arrayFlattenerService.flattenArray(a_input)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] actual = arrayReversor.reverseArray(a_input);
        int[] expected = new int[]{9,5,4,0,3,1};
        assertArrayEquals(expected, actual);
        verify(arrayFlattenerService).flattenArray(a_input);
    }
}