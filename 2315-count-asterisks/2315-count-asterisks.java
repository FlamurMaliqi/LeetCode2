public class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean withinPair = false;
        
        for (char c : s.toCharArray()) {
            if (c == '|') {
                withinPair = !withinPair; 
            } else if (c == '*' && !withinPair) {
                count++;
            }
        }
        
        return count;
    }
}
