package LinearSearch;

public class LinearSearch<E> {
    private LinearSearch() {};
    public static <E> int search(E[] data, E target) {

        for (int i = 0; i < data.length; i++){
            if (data[i].equals(target))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] sampleSize = {1000000, 10000000};
        for (int n : sampleSize) {
            Integer[] data = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int k = 0; k < 100; k++){
                LinearSearch.search(data, n);
            }
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;

            System.out.println("Sample size: " + n + " runs: " + 100 + " time: " + time);
        }
    }
 }
