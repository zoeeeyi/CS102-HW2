import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 7};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] array){
        int temp;
        int size = array.length;
        for (int i = 1; i < size; i++){
            int j = i;
            temp = array[i];

            //Start checking from the left of the number
            while (j > 0 && temp < array[j - 1]){
                array[j] = array[j - 1];// right shifting
                j--;
            }
            array[j] = temp;
        }
    }
}

//O(n^2)

//Fast if array is nearly sorted (fewer inserting and right shifting)

//How human sort cards in hand