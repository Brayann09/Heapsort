package Heapsort;

/**
 *
 * @author felip
 */
public class HeapSort {

    // Función principal de Heapsort
    public void sort(int arr[]) {
        int n = arr.length;

        // Construir el max-heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extraer elementos del heap uno por uno
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual (el máximo) al final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Llamar a heapify para reducir el tamaño del heap
            heapify(arr, i, 0);
        }
    }

    // Función para reorganizar el heap
    void heapify(int arr[], int n, int i) {
        int largest = i;   // Inicializar el nodo más grande como la raíz
        int izquierdo = 2 * i + 1;  // Hijo izquierdo
        int derecho = 2 * i + 2; // Hijo derecho

        // Si el hijo izquierdo es mayor que la raíz
        if (izquierdo < n && arr[izquierdo] > arr[largest]) {
            largest = izquierdo;
        }

        // Si el hijo derecho es mayor que el nodo más grande
        if (derecho < n && arr[derecho] > arr[largest]) {
            largest = derecho;
        }

        // Si el nodo más grande no es la raíz
        if (largest != i) {
            // Intercambiar el nodo más grande con la raíz
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursivamente aplicar heapify en el subarbol afectado
            heapify(arr, n, largest);
        }
    }

    // Método para imprimir el arreglo
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
