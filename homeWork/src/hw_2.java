import java.util.Random;

public class hw_2 {
    public static void main(String[] args) {
        int[] a = new int[] {3, 8, 2, 6, 1, 9, 5};
        printArray(a);

        heapSort(a);
    }


    // алгоритм пирамидальной сортировки
    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i++) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i++) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;

        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static int[] createArray(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = new Random().nextInt(10);
        }
        return a;
    }

}
