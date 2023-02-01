package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    private SelectionSort() {};

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 3, 1, 5};
        selectionSort(arr);
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println("");
    }
}
