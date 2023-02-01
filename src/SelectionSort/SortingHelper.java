package SelectionSort;

public class SortingHelper {

    private SortingHelper() {};

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortname, E[] arr) {

        long startTime = System.nanoTime();
        switch (sortname) {
            case "SelectionSort":
                SelectionSort.selectionSort(arr);
                break;
            case "SelectionSortTwo":
                SelectionSort.selectionSortTwo(arr);
                break;
            case "InsertionSort":
                InsertionSort.insertionSort(arr);
                break;
            case "InsertionSortTwo":
                InsertionSort.insertionSortTwo(arr);
                break;
            default:
                break;
        }
        long endTime = System.nanoTime();

        if (!isSorted(arr)) {
            throw new RuntimeException(sortname + "Failed");
        }

        double time = (endTime - startTime) / 1000000000.0;

        System.out.println(String.format("%s, n = %d, %f s", sortname, arr.length, time));
    }
}
