public class MEDIUM_Longest_Substring_Without_Repeating_Characters {


    public static int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128];
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            left = Math.max(charIndex[currentChar], left);

            maxLength = Math.max(maxLength, right - left + 1);

            charIndex[currentChar] = right + 1;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.printf("Ví dụ 1: Đầu vào = \"%s\" -> Kết quả: %d\n", s1, lengthOfLongestSubstring(s1));
        System.out.printf("Ví dụ 2: Đầu vào = \"%s\" -> Kết quả: %d\n", s2, lengthOfLongestSubstring(s2));
        System.out.printf("Ví dụ 3: Đầu vào = \"%s\" -> Kết quả: %d\n", s3, lengthOfLongestSubstring(s3));
    }
}