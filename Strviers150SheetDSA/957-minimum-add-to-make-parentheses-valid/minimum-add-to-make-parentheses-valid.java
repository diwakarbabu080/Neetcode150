class Solution {
    public int minAddToMakeValid(String s) {

        int pos = 0;
        int neg = 0;
        // int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // count = index;

                pos++;
                // index++;
            } else {
                // index--;
                if (pos > 0) {
                    pos--; // match with a previous '('
                } else {
                    neg++; // no '(' available to match, so unmatched ')'
                }

            }
        }
        return pos+neg;
    }
}