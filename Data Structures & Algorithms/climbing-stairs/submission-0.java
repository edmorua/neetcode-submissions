class Solution {
    int[] memoArray;
    public int climbStairs(int n) {
        memoArray = new int[n+1];
        return dfs(n);
    }

    public int dfs(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        if(memoArray[n] != 0) return memoArray[n];
        memoArray[n] = dfs(n-1) + dfs(n-2);
        return memoArray[n];
    }
}
