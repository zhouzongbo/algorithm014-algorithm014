class Solution {
    public String getHint(String secret, String guess) {
        // 题意: 
        // 1.猜对数字和位置, 则是公牛
        // 2.猜对数字但位置不对, 则是母牛
        // 3.数字连续出现, 只算一次
        // 时间复杂度: O(N)
        // 空间复杂度: O(N)
        int[] buckets = new int[10]; // 只会有0-9之间的数字
        int bulls = 0; //公牛数量
        int cows = 0; // 母牛数量
        for (int i = 0; i < secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if (s == g) {
                bulls++;
                continue;
            }

            if (buckets[s] < 0) {
                // secret当前的值在guess中出现, 则母牛数+1
                cows++;
            }
            if (buckets[g] > 0) {
                // guess的当前值, 在secret中出现,并且不是连续出现
                cows++;
            }
            buckets[s]++; // 出现在secret则+1;
            buckets[g]--;// 出现在guess中的值-1;
        }
        return bulls + "A" + cows + "B";
    }
}