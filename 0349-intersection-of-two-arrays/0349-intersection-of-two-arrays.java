class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int nums:nums2)
        {
            if(set1.contains(nums))
            {
                set2.add(nums);
            }
        }
        int[] arr=new int[set2.size()];
        int i =0;
        for(int nums:set2)
        {
            arr[i++] = nums;
        }
        return arr;
        


        
    }
}