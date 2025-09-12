class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        int diff = max - min - 2 * k;
        return diff > 0 ? diff : 0;
    }
}