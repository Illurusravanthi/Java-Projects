package chitra;
import java.util.*;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubString obj = new LongestSubString();
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + obj.lengthOfLongestSubstring(s)); // Output: 3
    }
}
