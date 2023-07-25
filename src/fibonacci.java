public class fibonacci {
    public static void main(String[] args) {
        System.out.println(betterfib(100));
    }

    private static long fib(int n) {
        if (n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static long betterfib(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}