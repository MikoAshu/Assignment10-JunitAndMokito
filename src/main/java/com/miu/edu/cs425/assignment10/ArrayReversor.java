package com.miu.edu.cs425.assignment10;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayReversor {

    private final ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] inputArray) {
        if (inputArray == null) return null;
        int[] flatArray = arrayFlattenerService.flattenArray(inputArray);
        List<Integer> reversedList = IntStream.of(flatArray).boxed().collect(Collectors.toList());
        Collections.reverse(reversedList);
        return reversedList.stream().mapToInt(Integer::intValue).toArray();
    }
}
