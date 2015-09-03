public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charset = new int[256];
        int maxLength = 0;
        int low = 1;
        int high = 1;
        for (int index = 0; index < s.length(); index++) {
            char a = s.charAt(index);
            if (charset[a] >= low) {
                low = charset[a] + 1;
            }
            charset[a] = index + 1;
            high++;
            if (high - low > maxLength) {
                maxLength = high - low;
            }
        }
        return maxLength;
    }
}
