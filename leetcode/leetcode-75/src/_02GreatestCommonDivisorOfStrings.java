/**
 * Author: Avinash Mishra
 * User: avinash
 * Date: 15/08/25
 */

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * <p>
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * <p>
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 */
public class _02GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            return str1;
        }
        return gcdOfStrings(str1, str2);
    }

    public static void main(String[] args) {
        _02GreatestCommonDivisorOfStrings gcd = new _02GreatestCommonDivisorOfStrings();
        System.out.println(gcd.gcdOfStrings("abcdefghij", "abc"));
    }
}
