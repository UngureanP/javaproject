package com.mycompany.sort;

import java.util.List;

public class InsertionSort {

    public void doInsertionSort(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        int temp;
        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j) < list.get(j - 1)) {
                    temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(list.getClass() + " InsertionSort = " + (endTime - startTime) + " ms");
    }
}
