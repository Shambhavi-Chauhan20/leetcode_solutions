class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0)
        {
            int d = x % 10;
            if(rev>(Math.pow(2,31)-1)/10 || rev < -(Math.pow(2,31)/10))
            {
                return 0;
            }
            rev = rev*10+d;
            x = x /10;
        }
        return rev;
        
    }
}