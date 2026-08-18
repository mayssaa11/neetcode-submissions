class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length()==0) return 0;

        int maxStreak = 0;

        int left = 0;
        int right = left;
        Set<Character> set = new HashSet<>();
        while (right < s.length()){
            if (set.contains(s.charAt(right))){
                maxStreak = Math.max(right-left,maxStreak); //current streak = right-left
                set.clear();
                left++;
                right = left;
            } else {
                set.add(s.charAt(right));
                right++;
            }
        }
        maxStreak = Math.max(right-left,maxStreak); 

        return maxStreak;
    }
}
