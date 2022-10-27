import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array)
    { 
        int temp;
        int size = array.length;
        for (int i = 0; i < size - 1;i++)
        {
            for (int j = 0; j < size - (i + 1); j++)
            {
                if (array[j] > array[j+1])
                { 
                    //swap
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

//O(n^2)
