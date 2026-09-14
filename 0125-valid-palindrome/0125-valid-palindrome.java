class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        boolean flag = true;
        while(left < right)
        {
            if(s.charAt(left) == s.charAt(right))
            {
                left++;
                right--;
            }else if(!Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
        
        
    }
}