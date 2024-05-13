class Solution 
{
    public int hammingWeightfunc(int n)
    {
        int count = 0;
        while (n > 0) 
        {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    
    public int hammingWeight(int n) 
    {
        String binaryString = Integer.toBinaryString(n);
        return hammingWeightfunc(n);
    }
}