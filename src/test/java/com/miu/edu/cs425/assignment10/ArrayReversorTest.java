package com.miu.edu.cs425.assignment10;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class ArrayReversorTest {

    @Mock
    private ArrayFlattenerService arrayFlattenerService;

    private ArrayReversor arrayReversor;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @Test
    public void testReverseArrayWithLegitInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        assertArrayEquals(expectedOutput, arrayReversor.reverseArray(inputArray));
        verify(arrayFlattenerService).flattenArray(inputArray);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        when(arrayFlattenerService.flattenArray(null)).thenReturn(null);
        assertNull(arrayReversor.reverseArray(null));
        verify(arrayFlattenerService).flattenArray(null);
    }
}
