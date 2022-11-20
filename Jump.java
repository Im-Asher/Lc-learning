public class Jump {
    public int jump(int[] nums) {
        int ans = 0;
        int max = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == end) {
                end = max;
                ans++;
            }
        }
        return ans;
    }
}
