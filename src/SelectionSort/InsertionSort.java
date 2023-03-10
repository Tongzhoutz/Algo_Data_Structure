package SelectionSort;

import java.util.Arrays;

public class InsertionSort {
    private InsertionSort(){};

    public static <E extends Comparable<E>> void insertionSort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
/*
            for (int j = i; j - 1 >= 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0)
                    swap(arr, j, j - 1);
                else break;
            }
*/
            for (int j = i; j - 1 >= 0 && arr[j].compareTo(arr[j - 1]) < 0; j--)
                swap(arr, j, j - 1);

        }
    }

    public static <E extends Comparable<E>> void insertionSortTwo(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            E temp = arr[i];
            int j;
            for (j = i; j - 1 >= 0; j--) {
                if (arr[j - 1].compareTo(temp) > 0)
                    arr[j] = arr[j - 1];
                else break;
            }
            // arr[j - 1] <= temp
            arr[j] = temp;
        }
    }

    public static <E extends Comparable<E>> void insertionSortBackward(E[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            E temp = arr[i];
            int j;
            for (j = i; j + 1 <= arr.length - 1 && arr[j + 1].compareTo(temp) < 0; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
    }
    public static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};

        for (int n : dataSize) {
            System.out.println("Random Array:");
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("SelectionSort", arr);
            // SortingHelper.sortTest("InsertionSortTwo", arr2);
            SortingHelper.sortTest("InsertionSortBackward", arr2);

            System.out.println();

            System.out.println("Ordered Array :");
            arr = ArrayGenerator.generateOrderedArray(n);
            arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("SelectionSort", arr);
            // SortingHelper.sortTest("InsertionSort", arr2);
            SortingHelper.sortTest("InsertionSortBackward", arr2);

            System.out.println();
        }
    }
}
