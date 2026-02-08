class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int start = i;
            int lineLength = 0;

            // Pack words
            while (i < words.length &&
                   lineLength + words[i].length() + (i - start) <= maxWidth) {
                lineLength += words[i].length();
                i++;
            }

            int wordCount = i - start;
            int numberOfGaps = wordCount - 1;
            int totalSpaces = maxWidth - lineLength;

            StringBuilder line = new StringBuilder();

            // Case 1: last line or single word
            if (i == words.length || numberOfGaps == 0) {
                for (int k = start; k < i; k++) {
                    line.append(words[k]);
                    if (k < i - 1) {
                        line.append(" ");
                    }
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            }
            // Case 2: fully justified
            else {
                int spacePerGap = totalSpaces / numberOfGaps;
                int extraSpaces = totalSpaces % numberOfGaps;

                for (int k = start; k < i; k++) {
                    line.append(words[k]);
                    if (k < i - 1) {
                        for (int s = 0; s < spacePerGap; s++) {
                            line.append(" ");
                        }
                        if (extraSpaces > 0) {
                            line.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            result.add(line.toString());
        }

        return result;
    }
}
