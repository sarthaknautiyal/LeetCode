class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        long MOD = 1_000_000_007;

      
        long[] power = new long[n];

        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        int l = 0;
        int r = n - 1;
        long result = 0;

        while (l <= r) {

            if (nums[l] + nums[r] <= target) {

                result = (result + power[r - l]) % MOD;
                l++;

            } else {
                r--;
            }
        }

        return (int) result;
    }
}