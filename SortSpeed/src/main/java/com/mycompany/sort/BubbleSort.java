
package com.mycompany.sort;

import java.util.List;

public class BubbleSort {

    public void bubble_srt(List<Integer> list) {
        int n = list.size();
        int k;

        long startTime = System.currentTimeMillis();
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (list.get(i) > list.get(k)) {
                    swapNumbers(k, i, list);

                }
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println(list.getClass() + " BubbleSort = " + (endTime - startTime) + " ms");

    }

    private void swapNumbers(int i, int j, List<Integer> list) {

        Integer temp;
        temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
