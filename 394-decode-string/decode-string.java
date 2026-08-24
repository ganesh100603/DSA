class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');

            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(curr.toString());

                num = 0;
                curr = new StringBuilder();

            } else if (ch == ']') {
                int repeat = numStack.pop();
                String prev = strStack.pop();

                StringBuilder temp = new StringBuilder(prev);

                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }

                curr = temp;

            } else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
