import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 7};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int List[])
    {
        int temp, min;
        int size = List.length;
        for (int i = 0; i < size; i++){
            min = i;
            for (int j = i + 1; j < size; j++)
            {
                if (List[j] < List[min])
                min = j;
            }

            //swap
            temp = List[min];
            List[min] = List[i]; 
            List[i] = temp;
        }
    }
}

//O(n^2)

//Selection Sort is more efficient than Bubble Sort, because of fewer exchanges in the former
