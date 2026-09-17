class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {
            last.put(nums[i], i);
        }

        int count = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            end = Math.max(end, last.get(nums[i]));

            if (i == end) {
                count++;
            }
        }
        long ans = 1;

        for (int i = 1; i < count; i++) {
            ans = (ans * 2) % 1000000007;
        }

        return (int) ans;
    }
}