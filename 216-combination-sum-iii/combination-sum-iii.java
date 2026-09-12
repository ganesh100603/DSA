import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(1, k, n, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
        int start,
        int k,
        int target,
        List<Integer> current,
        List<List<Integer>> result
    ) {

        // Found a valid combination
        if (current.size() == k) {

            if (target == 0) {
                result.add(new ArrayList<>(current));
            }

            return;
        }

        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {

            // Don't choose a number if it makes the sum too large
            if (i > target) {
                break;
            }

            current.add(i);

            backtrack(
                i + 1,
                k,
                target - i,
                current,
                result
            );

            // Remove the number and try another
            current.remove(current.size() - 1);
        }
    }
}