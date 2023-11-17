int maxArea(int* height, int heightSize) 
{
    int space = 0;
    int left = 0;
    int right = heightSize - 1;

    while (left < right)
    {
        int h = fmin(height[left], height[right]);
        int w = right - left;
        int temp = h * w;

        if (temp > space)
        {
            space = temp;
        }

        if (height[left] < height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
    }

    return space;
}
