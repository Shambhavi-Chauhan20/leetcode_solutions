class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int right = arr.length - 1;
        int left = 0;
        int ans = -1;
        
        while(left<=right)
        {
            int mid = left + (right - left)/2;
            if(arr[mid] > arr[mid+1])
            {
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
        
    }
}