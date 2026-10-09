class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int f = 0;

        if(n == 0)
            return 0;

        if(n == 1)
            return 1;

        for(int i = 2; i <= n; i++) {
            f = a + b;
            a = b;
            b = f;
        }

        return f;
    }
}