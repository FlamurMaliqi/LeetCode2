class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] modCounts = new int[k];
        modCounts[0] = 1;
        int sum = 0;
        int counter = 0;
        
        for (int num : nums) {
            sum = (sum + num) % k;
            if (sum < 0) // Handle negative mod results
                sum += k;
            counter += modCounts[sum];
            modCounts[sum]++;
        }
        
        return counter;
    }
}
