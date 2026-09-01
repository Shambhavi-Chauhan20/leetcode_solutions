class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int arrayXor = 0;
        int rangeXor = 0;
        for (int num : nums) {
            arrayXor ^= num;
        }
        for (int i = 0; i <= n; i++) {
            rangeXor ^= i;
        }
        return arrayXor ^ rangeXor;
    }
}