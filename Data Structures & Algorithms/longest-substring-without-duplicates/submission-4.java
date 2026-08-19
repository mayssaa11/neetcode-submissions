class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length()==0) return 0;

        int maxStreak = 0;

        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right=0; right<s.length(); right++){
            
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxStreak = Math.max(maxStreak, right-left+1);
        }
        return maxStreak;
    }
}
