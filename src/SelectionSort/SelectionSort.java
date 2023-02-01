package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    private SelectionSort() {};

    public static <E extends Comparable<E>> void selectionSort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    public static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {6, 4, 2, 3, 1, 5};
        selectionSort(arr);
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println("");

        Student[] students = { new Student("Alice", 89),
                               new Student("Blank", 100),
                               new Student("Cowles", 88)
        };

        selectionSort(students);

        for (Student s : students)
            System.out.println(s + " ");
    }
}
