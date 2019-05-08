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

    static void merge(int array[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = array[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = array[m + 1+ j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
    static long  mergeSort(int array[], int l, int r) {
        long beginTime = 0;
        long totalRuntime = 0;
        long endTime = 0;

        if (l < r) {
            beginTime = System.nanoTime();

            int m = (l+r)/2;
            mergeSort(array, l, m);
            mergeSort(array , m+1, r);
            merge(array, l, m, r);

        }
        endTime = System.nanoTime();
        totalRuntime = (endTime - beginTime);
        return totalRuntime;
    }




}
