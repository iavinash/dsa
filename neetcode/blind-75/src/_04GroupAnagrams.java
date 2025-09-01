/**
 * Author: Avinash Mishra
 * User: avinash
 * Date: 31/08/25
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
 * <p>
 * An anagram is a string that contains the exact same characters as another string,
 * but the order of the characters can be different.
 * <br>
 * Example 1:
 * <p>
 * Input: strs = ["act","pots","tops","cat","stop","hat"]
 * <p>
 * Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 * <br>
 * Input: strs = ["x"]
 * <p>
 * Output: [["x"]]
 */
public class _04GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted, list);
            } else {
                map.get(sorted).add(str);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            result.add(new ArrayList<>(entry.getValue()));
        }

        return result;
    }
    public static void main(String[] args) {
        _04GroupAnagrams groupAnagrams = new _04GroupAnagrams();
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        result.forEach(System.out::println);
    }
}
