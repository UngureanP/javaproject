/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sort;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


class Main {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        Random random = new Random();
        for (Integer i = 0; i < 1000; i++) {
            array.add(random.nextInt(1000) + 1);
        }
        linked.addAll(array);

        //BubbleSort
        BubbleSort bubble = new BubbleSort();
        bubble.bubble_srt(array);
        bubble.bubble_srt(linked);
        
        //SelectionSort
        SelectionSort selection = new SelectionSort();
        selection.doSelectionSort(array);
        selection.doSelectionSort(linked);
        
        //InsertionSort
        InsertionSort insertation = new InsertionSort();
        insertation.doInsertionSort(array);
        insertation.doInsertionSort(linked);

    }
}
