/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sort;

import java.util.List;

public class SelectionSort {

    public void doSelectionSort(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(index)) {
                    index = j;
                }
            }

            int smallerNumber = list.get(index);
            list.set(index, list.get(i));
            list.set(i, smallerNumber);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(list.getClass() + " SelectionSort = " + (endTime - startTime) + " ms");
    }
}
