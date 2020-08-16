class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 求数组中, 两个元素相加等于 target
        // 解法: 一遍hash表
        // 时间复杂度: O(N)
        // 空间复杂度: O(N)
        // key -> nums[i], value -> 下标
        Map<Integer, Integer> temp = new HashMap<>(nums.length);
        for (int i = 0;i < nums.length; i ++) {
            if (temp.containsKey(nums[i])) {
                return new int[] {temp.get(nums[i]), i};
            }
            temp.put(target - nums[i], i);
        }
        return new int[] {};
        
    }
}