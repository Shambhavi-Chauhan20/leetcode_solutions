class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]= new int[nums.length];
        int sum = 0;
        for(int i = 0; i <= nums.length-1 ; i ++)
        {
            sum = nums[i] + sum;
            arr[i] = sum;
        }
        return arr;
        
    }
}