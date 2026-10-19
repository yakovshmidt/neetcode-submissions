class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sLetterFrequency = findLettersToCounts(s);
        int[] tLetterFrequency = findLettersToCounts(t);

        for (int i = 0; i < 26; i++) {
            if (sLetterFrequency[i] != tLetterFrequency[i]) return false;
        }
        return true;
    }

    private int[] findLettersToCounts(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            counts[(int) (letter - 'a')]++;
        }
        return counts;
    }
}
