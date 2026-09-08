class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        // isPrime[1] = false;
        int count = 0;

        for(int i = 2; i <=Math.sqrt(n); i ++)
        {
            if(isPrime[i])
            {
                for(int j = i*i; j <=n ; j +=i)
                {
                    isPrime[j] = false;
                }
            }
        }
        for(int i =2; i < n; i++)
        {
            if(isPrime[i])
            {
                count++;
            }
        }
        return count;
        
    }
}