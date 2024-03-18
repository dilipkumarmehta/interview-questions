package com.dilip.array;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = { "amazon", "amazed", "amaze", "amazing", "amazes" };
        String longestCommonPrefix = longestCommonPrefix(str);
        System.out.println("Longest common prefix: " + longestCommonPrefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Iterate through the characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            System.out.println(c);
            // Compare the character with the corresponding characters of other strings
            //System.out.println(strs.length);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    // If characters don't match, return the substring up to the current index
                    return strs[0].substring(0, i);
                }
            }
        }
        // If all strings have the same prefix, return the first string
        return strs[0];
    }
}
