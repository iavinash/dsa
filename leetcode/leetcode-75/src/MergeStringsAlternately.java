/**
 * Author: Avinash Mishra
 * User: avinash
 * Date: 15/08/25
 */


/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 * <p>
 *
 * Example 1:
 * Input: word1 = "abc", word2 = "pqr"
 * <br/>
 * Output: "apbqcr"
 * <br/>
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        char[] res = new char[w1.length + w2.length];
        int i = 0;
        int p1 = 0; // index for w1
        int p2 = 0; // index for w2

        // Alternate characters from both strings
        while (p1 < w1.length && p2 < w2.length) {
            res[i++] = w1[p1++];
            res[i++] = w2[p2++];
        }

        // If w1 has remaining chars
        while (p1 < w1.length) {
            res[i++] = w1[p1++];
        }

        // If w2 has remaining chars
        while (p2 < w2.length) {
            res[i++] = w2[p2++];
        }
        return new String(res);
    }
    public static void main(String[] args) {
        MergeStringsAlternately m = new MergeStringsAlternately();
        System.out.println(" ");
        System.out.println(m.mergeAlternately("abcd", "pq"));
    }
}
