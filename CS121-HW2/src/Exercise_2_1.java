public class Exercise_2_1 {
    static double[] array = {5,6,3,2,4};
    public static void main(String[] args) {
        System.out.println(min(array, 0, array.length - 1));
    }

    static double min(double[] a, int start, int end){
        if (end == start)
            return a[start];

        int mid = (end + start) / 2;

        double min1 = min (a, start, mid);
        double min2 = min (a, mid + 1, end);

        if (min1 <= min2) return min1;
        else return min2;
    }
}
