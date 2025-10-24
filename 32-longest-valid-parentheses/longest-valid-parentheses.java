class Solution {
    public int longestValidParentheses(String s) {
         Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // base index for valid substring
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    // reset base index when invalid
                    stack.push(i);
                } else {
                    // valid substring length
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }
}