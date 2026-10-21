class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        
        int commonPrefix = 0;
        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j - 1].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, commonPrefix);
                }
            }
            commonPrefix++;
        }
        return strs[0].substring(0, commonPrefix);
    }
}