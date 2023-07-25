import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];

        Arrays.fill(mem,-1);

        System.out.println(fib(n, mem));
    }
    private static long fib(int n, long[] mem) {
        if (mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;

        long result =  fib(n - 1, mem) + fib(n - 2, mem);
        mem[n] = result;

        return  result;
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