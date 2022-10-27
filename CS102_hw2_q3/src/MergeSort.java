import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 7};
        array = mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static int[] merge(int[] array1, int[] array2){
        int[] newArray = new int[array1.length + array2.length];
        int i = 0;
        int i1 = 0;
        int i2 = 0;

        while (i1 < array1.length && i2 < array2.length){
            if (array1[i1] <= array2[i2]) {
                newArray[i]=array1[i1];
                i1++;
                i++;
            } else {
                newArray[i]=array2[i2];
                i2++;
                i++;
            }
  
        }
        while (i1 < array1.length) {
                newArray[i]=array1[i1]; 
                i1++;
                i++;
        }

        while (i2 < array2.length) {
            newArray[i]=array2[i2]; 
            i2++;
            i++;
        }
        return newArray;
    }

    static int[] mergeSort(int[] toSortArray, int leftIndex, int rightIndex){
        if (leftIndex == rightIndex) {
            return new int[]{toSortArray[leftIndex]};
        }

        int mid = (leftIndex+rightIndex)/2;

        int[] leftSortedArray = mergeSort(toSortArray, leftIndex, mid);
        int[] rightSortedArray = mergeSort(toSortArray ,mid+1, rightIndex);
        return merge(leftSortedArray, rightSortedArray);
    }
}


//O(nLog(n))

//Need extra space