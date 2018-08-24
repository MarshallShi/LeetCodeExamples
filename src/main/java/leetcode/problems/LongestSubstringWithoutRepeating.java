package leetcode.problems;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Examples:
 *
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 * Given "bbbbb", the answer is "b", with the length of 1.
 *
 * Given "pwwkew", the answer is "wke", with the length of 3.
 *
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String input = "acabcdbbdcfgiere";
        System.out.println(findLongest(input));
    }

    public static String findLongest(String input) {
        String result = "";
        String temp = "";
        int len = input.length();
        for (int i=0; i<len; i++) {
            char current = input.charAt(i);
            if (temp.indexOf(String.valueOf(current)) == -1) {
                temp = temp + String.valueOf(current);
            } else {
                if (temp.length() > result.length()) {
                    result = temp;
                }
                temp = String.valueOf(current);
            }
        }
        if (temp.length() > result.length()) {
            return temp;
        }
        return result;
    }

}
