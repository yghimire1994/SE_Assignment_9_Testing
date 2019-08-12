package com.yubraj.se.assignment9.mockitotesting.question4;

import com.yubraj.se.assignment9.mockitotesting.question4.service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorNullTest {
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
    public void testReverseArrayNull() {
        int[][] a_input = null;
        when(arrayFlattenerService.flattenArray(a_input)).thenReturn(null);
        int[] actual = arrayReversor.reverseArray(a_input);
        int[] expected = null;
        assertArrayEquals(expected, actual);
        verify(arrayFlattenerService).flattenArray(a_input);
    }
}