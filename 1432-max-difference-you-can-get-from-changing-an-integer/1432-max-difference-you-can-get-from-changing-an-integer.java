public class Solution {
    public static int maxDiff(int num) {
        String numStr = Integer.toString(num);
        char[] maxChars = numStr.toCharArray();
        char[] minChars = numStr.toCharArray();
        
        // Maximize the number
        char maxReplace = ' ';
        for (char c : maxChars) {
            if (c != '9') {
                maxReplace = c;
                break;
            }
        }
        if (maxReplace != ' ') {
            for (int i = 0; i < maxChars.length; i++) {
                if (maxChars[i] == maxReplace) {
                    maxChars[i] = '9';
                }
            }
        }
        
        // Minimize the number
        char minReplace = minChars[0];
        if (minReplace != '1') {
            for (int i = 0; i < minChars.length; i++) {
                if (minChars[i] == minReplace) {
                    minChars[i] = '1';
                }
            }
        } else {
            for (char c : minChars) {
                if (c != '0' && c != '1') {
                    minReplace = c;
                    break;
                }
            }
            if (minReplace != '1') {
                for (int i = 0; i < minChars.length; i++) {
                    if (minChars[i] == minReplace) {
                        minChars[i] = '0';
                    }
                }
            }
        }
        
        int maxNum = Integer.parseInt(new String(maxChars));
        int minNum = Integer.parseInt(new String(minChars));
        
        return maxNum - minNum;
    }

}
