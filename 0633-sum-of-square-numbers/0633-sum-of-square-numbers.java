
class Solution {
    public boolean judgeSquareSum(int c) 
    {
        if (Math.pow((int)Math.sqrt(c), 2) == c) {
            return true;
        }
        for (int a = 1; a <= Math.sqrt(c / 2); a++) {
            int b = c - a * a;
            if (Math.pow((int)Math.sqrt(b), 2) == b) {
                return true;
            }
        }
        return false;    
    }
}