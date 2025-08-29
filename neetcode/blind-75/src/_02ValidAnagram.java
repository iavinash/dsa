/**
 * Author: Avinash Mishra
 * User: avinash
 * Date: 29/08/25
 */

/**
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 * <p>
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 * <br>
 * Input: s = "racecar", t = "carrace"
 * Output: true
 * <p>
 * Input: s = "jar", t = "jam"
 * Output: false
 */
public class _02ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;

        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        _02ValidAnagram validAnagram = new _02ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("rat", "car"));
    }
}
