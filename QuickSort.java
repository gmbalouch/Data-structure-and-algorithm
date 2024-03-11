
public class QuickSort {

	 public static void main(String[] args) {
	        int[] arr = {5, 4, 7, 1, 15, 3, 2, 8, 9, 11};
	        int n = arr.length;

	        System.out.println("Original array:");
	        printArray(arr);

	        quickSort(arr, 0, n - 1);

	        System.out.println("\nSorted array:");
	        printArray(arr);
	    }

	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int partitionIndex = partition(arr, low, high);

	            // Recursively sort the elements before and after the partition index
	            quickSort(arr, low, partitionIndex - 1);
	            quickSort(arr, partitionIndex + 1, high);
	        }
	    }

	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;

	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Swap arr[i+1] and arr[high] (pivot)
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
}
