class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length()==0) return 0;

        int maxStreak = 0;

        int left = 0;
        int right = left;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()){
            char c = s.charAt(right);
            if (map.containsKey(c)){
                maxStreak = Math.max(right-left,maxStreak); //current streak = right-left
                int newLeft = map.get(c);
                final int currentLeft = left;
                map.entrySet().removeIf(entry -> entry.getValue() >= currentLeft && entry.getValue() <= newLeft); // remove all elements of map of values in [left, map.get(c)] 
                left = newLeft+1;
            }
            map.put(c, right);
            right++;
        }
        maxStreak = Math.max(right-left,maxStreak); 

        return maxStreak;
    }
}
