class Solution {
    public int getLucky(String s, int k) 
    {

        StringBuilder summe_string_builder = new StringBuilder();
        int summe = 0;
        for (char c : s.toCharArray()) {
            int digit = c - 'a' + 1;
            if (digit > 9)
            {
                summe = summe + digit%10 + digit/10;
            }
            else
            {
                summe = summe + digit;
            }
            summe_string_builder.append(digit);
            System.out.println(summe);
        }

        if (k == 1)
        {
            return summe;
        }
        String summe_string = summe_string_builder.toString();
        if (k<1)
        {
            long summe_temp = Long.parseLong(summe_string);
            return (int) summe_temp;
        }
        else
        {
            for (int i = 1; i < k; i++) {
            summe = transform(summe);
                
            }
        
        return (int) summe;
        }
    }

    public int transform(long k) {
        long summe = 0;
        while (k > 0) {
            summe += k % 10;
            k /= 10;
        }
        return (int) summe;
    }
}
