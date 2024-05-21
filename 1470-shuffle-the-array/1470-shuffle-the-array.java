class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] returnNum = new int[nums.length];
        int[] leftSide = Arrays.copyOfRange(nums,0,n);
        int[] rightSide = Arrays.copyOfRange(nums, n, nums.length);
            
        for(int i = 0; i < returnNum.length; i++)
        {
            if(i%2==0)
            {
                returnNum[i] = leftSide[i/2];
            }
            else
            {
                returnNum[i] = rightSide[(i-1)/2];
            }
        }
         return returnNum;
    }
}