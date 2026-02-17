import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words.length == 0)
            return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen)
            return result;

        // Step 1: Build frequency map of words
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        // Step 2: Try different starting offsets
        for (int i = 0; i < wordLen; i++) {

            int left = i;
            int right = i;
            int count = 0;

            Map<String, Integer> currentMap = new HashMap<>();

            // Step 3: Sliding window
            while (right + wordLen <= s.length()) {

                String sub = s.substring(right, right + wordLen);
                right += wordLen;

                if (frequency.containsKey(sub)) {

                    currentMap.put(sub, currentMap.getOrDefault(sub, 0) + 1);
                    count++;

                    // If word appears too many times → shrink window
                    while (currentMap.get(sub) > frequency.get(sub)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    // If we matched all words
                    if (count == wordCount) {
                        result.add(left);
                    }

                } else {
                    // Invalid word → reset window
                    currentMap.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}
