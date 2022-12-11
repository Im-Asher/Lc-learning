public class MinOperations {
    public int minOperations(int[] nums) {
        int ans = 0;
        int MIN = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (MIN >= nums[i]) {
                ans += MIN - nums[i] + 1;
                nums[i] += MIN - nums[i] + 1;
                MIN = nums[i];
                continue;
            }
            MIN = nums[i];
        }
        return ans;
    }
}
