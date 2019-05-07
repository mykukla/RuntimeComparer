package com.dberekdar.runtimecompare;

public class aCompare {

    public static long bubbleSort(int[] array) {
        long beginTime = System.nanoTime();

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long totalRuntime = (endTime - beginTime);
        return totalRuntime;
    }

    public static long insertionSort(int [] array){
        long beginTime = System.nanoTime();
        for (int i=1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }

        long endTime = System.nanoTime();
        long totalRuntime = (endTime - beginTime);
        return totalRuntime;
    }

    public static long selectionSort(int [] array){
        long beginTime = System.nanoTime();

        for (int i = 0; i < array.length -1; i++) {
            int minimum = i;
            for (int j  = i+1; j < array.length; j++){
                if (array[j] < array[minimum]){
                    minimum = j;
                    int tmp = array[minimum];
                    array[minimum] = array[i];
                    array[i] = tmp;
                }
            }
        }

        long endTime = System.nanoTime();
        long totalRuntime = (endTime - beginTime);
        return totalRuntime;
    }

    public static long mergeSort(int[] array){
        long beginTime = System.nanoTime();
        long endTime = System.nanoTime();
        long totalRuntime = (endTime - beginTime); //Calculating runtime of the insertion sort algorithm;
        return totalRuntime;

    }


}
