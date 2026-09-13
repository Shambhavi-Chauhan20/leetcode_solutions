class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length;i++)
        {
            int n = nums[i];
            int l = countdigits(n);
            if(l % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    
    int countdigits(int n)
    {
        int count = 0;
        while(n > 0)
        {
            int d = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
        
}