import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 7};
        bubbleSortRecursion(array, array.length);
        System.out.println(Arrays.toString(array));

    }

    static int[] bubbleSortRecursion(int[] array, int n){
        if (n == 1) return array;
        for (int i = 0; i < n - 1; i++){
            if (array[i] > array[i + 1]){
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        return bubbleSortRecursion(array, n - 1);
    }
}
