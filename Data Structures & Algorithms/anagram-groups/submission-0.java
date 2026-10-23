class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsToOriginals = new HashMap<>();
        for (String str : strs) {
            String anagram = toAnagram(str);
            anagramsToOriginals.putIfAbsent(anagram, new ArrayList<>());
            anagramsToOriginals.get(anagram).add(str);
        }
        List<List<String>> result = new ArrayList<>(anagramsToOriginals.values());
        return result;
    }

    private String toAnagram(String str) {
        int[] alphabet = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            alphabet[letter - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            int letterCount = alphabet[i];
            while (letterCount > 0) {
                sb.append('a' + i);
                letterCount--;
            }
        }
        return sb.toString();
    }
}
