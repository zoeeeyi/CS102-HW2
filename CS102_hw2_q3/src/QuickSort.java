import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 7};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static int Partition(int[] array, int low, int high, int pivotNum){ 
        //int pivot = array[pivotNum];
        int pivot = pivotNum;
      
        while (true) {
            while (array[low] < pivot){
                low++;
            }

            while (array[high] > pivot){
                high--;
            }
        
            if (high > low) {
                //Swap
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            } else {
                return high;
            }
        }
    }
    
    static void quickSort(int[] a, int low, int high){
        if (low < high){
            int pivotNum = a[low];
            int pivot_index = Partition(a, low, high, pivotNum);
            quickSort(a, low, pivot_index - 1);
            quickSort(a, pivot_index + 1, high);
        }
    }
}

//Best case: O(nLog(n))
//Worst case: O(n^2)
