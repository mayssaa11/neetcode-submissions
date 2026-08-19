class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length()==0) return 0;

        int maxStreak = 0;

        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            if (map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c, right);
            maxStreak = Math.max(right-left+1,maxStreak); 
        }

        return maxStreak;
    }
}
