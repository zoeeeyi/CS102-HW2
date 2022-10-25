public class Exercise_2_2 {
    public static void main(String[] args) {
        System.out.println(ZeroInBinaryCount(100));
    }
    static int ZeroInBinaryCount(int n){
        if (n == 0) return 1;
        if (n == 1) return 0;

        if (n % 2 == 0) return 1 + ZeroInBinaryCount(n / 2);
        else return ZeroInBinaryCount(n / 2);
    }
}
