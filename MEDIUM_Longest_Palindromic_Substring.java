public class MEDIUM_Longest_Palindromic_Substring {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "babad";
        System.out.println("Input: s = \"" + s1 + "\"");
        System.out.println("Output: \"" + solution.longestPalindrome(s1) + "\"");
        System.out.println("---");

        String s2 = "cbbd";
        System.out.println("Input: s = \"" + s2 + "\"");
        System.out.println("Output: \"" + solution.longestPalindrome(s2) + "\"");
    }

    static class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";
            int start = 0, end = 0;
            for (int i = 0; i < s.length(); i++) {
                int len1 = expandAroundCenter(s, i, i);
                int len2 = expandAroundCenter(s, i, i + 1);
                int maxLen = Math.max(len1, len2);
                if (maxLen > (end - start)) {
                    start = i - (maxLen - 1) / 2;
                    end = i + maxLen / 2;
                }
            }
            return s.substring(start, end + 1);
        }

        private int expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return right - left - 1;
        }
    }
}