package com.miu.edu.cs425.assignment10;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {

    public static int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) return null;

        List<Integer> flatList = new ArrayList<>();

        for (int[] subArray : inputArray) {
            for (int num : subArray) {
                flatList.add(num);
            }
        }

        int[] flatArray = new int[flatList.size()];
        for (int i = 0; i < flatList.size(); i++) {
            flatArray[i] = flatList.get(i);
        }

        return flatArray;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 3}, {0}, {4, 5, 9}};
        int[] flatArray = flattenArray(array);

        for (int num : flatArray) {
            System.out.print(num + " ");
        }
    }
}
