import java.util.Random;

public class hw_2 {
    public static void main(String[] args) {
        int[] a = new int[] {3, 8, 2, 6, 1, 9, 5};
        printArray(a);

        heapSort(a);
    }


    // алгоритм пирамидальной сортировки
    public static void sort(int[] array, int size) {
        for (int i = 0; i <= size / 2 - 1; i++) {
            int parent = i;
            int leftChild = i * 2 + 1;
            int rightChild = i * 2 + 2;

            if (array[parent] < array[leftChild]) {
                int temp = array[parent];
                array[parent] = array[leftChild];
                array[leftChild] = temp;
            }
            if (array[parent] < array[rightChild]) {
                int temp = array[parent];
                array[parent] = array[rightChild];
                array[rightChild] = temp;
            }
        }
        printArray(array);
    }

    public static void heapSort(int[] array) {
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;
        int i = 0;
        i++;
        if (array[0] != 1) {
            sort(array, array.length-i);
            heapSort(array);
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
