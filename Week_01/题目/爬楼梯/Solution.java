class Solution {
    public int climbStairs(int n) {
        // 题意: 有多少种怕楼梯的方法
        // 解法1： 递归: 时间复杂度 (n^2)， 递推公式 终止条件 f(n) = f(n -1 ) + f(n -2)
        // 解法2:  记忆法, 通过一个数组, 把爬每一阶楼梯的方式记录下来, 
        // 解法3： 由于这里只需要返回最后的解法, 所以只需要记录当前楼梯的上一级和上上一级就阔以
        int[] steps = new int[n + 1];
        steps[0] = 1;
        steps[1] = 1;
        for (int i = 2; i <= n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }
}