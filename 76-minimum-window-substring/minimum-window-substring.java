import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) return "";

        Map<Character, Integer> targetMap = new HashMap<>();

        // Step 1: Build frequency map of t
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = targetMap.size();  // unique characters needed
        int formed = 0;

        Map<Character, Integer> windowMap = new HashMap<>();

        int left = 0, right = 0;

        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        // Step 2: Sliding window
        while (right < s.length()) {

            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            // Check if current character satisfies target frequency
            if (targetMap.containsKey(c) &&
                windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            // Step 3: Try shrinking window
            while (left <= right && formed == required) {

                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (targetMap.containsKey(leftChar) &&
                    windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(startIndex, startIndex + minLen);
    }
}
