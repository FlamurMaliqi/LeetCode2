class Solution 
{
    public int absolute(int num)
    {
        if (num < 0)
        {
            return -num;
        }
        else
        {
            return num;
        }
    }
    public int findClosestNumber(int[] nums) 
    {
        int small = absolute(nums[0]);
        ArrayList<Integer> solution = new ArrayList<>();
        for(int number:nums)
        {
            if(small> absolute(number))
            {
                small = absolute(number);
                solution.clear();
                solution.add(number);
            }
            else if(small == absolute(number))
            {
                solution.add(number);
            }
        }
        
        int big = solution.get(0);
        for (int numbers: solution)
        {
            if (numbers > big)
            {
                big = numbers;
            }
        }
        return big;
    }
}