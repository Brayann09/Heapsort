package Heapsort;

import static Heapsort.HeapSort.printArray;

/**
 *
 * @author felip
 */
public class HeapSortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {39, 26, 89, 1, 8, 7};
        System.out.println("Arreglo original:");
        printArray(arr);

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }
    }
    

