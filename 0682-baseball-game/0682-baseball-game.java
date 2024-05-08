import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> integerList = new ArrayList<>();
        int len = operations.length;
        int last = 0;
        int last_last = 0;
        for (int i = 0; i < len; i++) {
            int size = integerList.size();
            if (size > 0) {
                last = integerList.get(size - 1);
                last_last = (size > 1) ? integerList.get(size - 2) : 0;
            }
            if (operations[i].equals("C")) {
                if (size > 0) {
                    integerList.remove(size - 1);
                }
            } else if (operations[i].equals("D")) {
                integerList.add(2 * last);
            } else if (operations[i].equals("+")) {
                integerList.add(last + last_last);
            } else {
                integerList.add(Integer.parseInt(operations[i]));
            }
        }
        int summe = 0;
        for (int entry : integerList) {
            summe = summe + entry;
        }
        return summe;
    }
}
