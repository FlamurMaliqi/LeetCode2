class Solution {
    public int minOperations(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int number:nums)
        {
             if(map.containsKey(number))
             {
                 map.put(number, map.get(number)+1);
             }
             else
             {
                 map.put(number, 1);
             }
        
        }
        int counter = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            int value = entry.getValue();
            if(value == 1)
            {
                return -1;
            }
            while(value !=  0)
            {
                if(value == 1 || value == 2)
                {
                    counter ++;
                    value = 0;
                }
                else
                {
                    value = value - 3;
                    counter ++;
                }
            }
            
        }
        return counter;
    }
   
}