public class l567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        Solution sol = new Solution();
        boolean result = sol.checkInclusion(s1, s2);

        System.out.println(result); // should print true
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count frequency of s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        // Sliding window
        for (int i = 0; i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) {
                s2Count[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (matches(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
