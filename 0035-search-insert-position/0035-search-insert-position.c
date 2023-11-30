int binarySearch(int* nums, int low, int high, int target) 
{
    if (low <= high) 
    {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) 
        {
            return mid;
        } 
        else if (nums[mid] < target) 
        {
            return binarySearch(nums, mid + 1, high, target);
        } 
        else 
        {
            return binarySearch(nums, low, mid - 1, target);
        }
    }

    return low;
}

int searchInsert(int* nums, int numsSize, int target) 
{
    return binarySearch(nums, 0, numsSize - 1, target);
}
