class Solution {
    public String reverseWords(String s) {
         s = s.trim();
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        int start;

     while (end >= 0) {
            // Move start to beginning of word
            start = end;
            while (start >= 0 && s.charAt(start) != ' ') start--;

            // Append word
            sb.append(s.substring(start + 1, end + 1)).append(" ");

            // Skip multiple spaces
            while (start >= 0 && s.charAt(start) == ' ') start--;

            end = start;
        }

        // Remove trailing space
        return sb.toString().trim();
    }
}