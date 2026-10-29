class Solution {
    public boolean isPowerOfTwo(int n) {
        double ans = 0;
        int i = 0;
        while(ans <= n){
            ans = Math.pow(2, i);
            if(ans == n)
                return true;
            i++;
        }
        return false;
    }
}