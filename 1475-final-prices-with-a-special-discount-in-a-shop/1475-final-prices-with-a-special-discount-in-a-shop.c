int* finalPrices(int* prices, int pricesSize, int* returnSize) 
{
    *returnSize = pricesSize;
    int* discountedPrices = malloc(sizeof(int) * pricesSize);
    
    for (int i = 0; i < pricesSize; i++)
    {
        int discount = 0;
        for (int j = i + 1; j < pricesSize; j++)
        {
            if (prices[j] <= prices[i])
            {
                discount = prices[j];
                break;
            }
        }
        discountedPrices[i] = prices[i] - discount;
    }
    
    return discountedPrices;
}
