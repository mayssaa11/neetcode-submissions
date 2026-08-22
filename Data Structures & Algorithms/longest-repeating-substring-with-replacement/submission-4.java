class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character, Integer> frequencies = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int maxStreak = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            frequencies.put( c, frequencies.getOrDefault(c,0)+1 );
            maxFreq = Collections.max(frequencies.values());

            // window is valid when: windowLength<=maxFreq+k
            if ( (right-left+1)-maxFreq > k) {
                // invalid window: shrink the window
                char leftChar = s.charAt(left);
                frequencies.put( leftChar, frequencies.get(leftChar)-1 );
                left++;
            }
            maxStreak = Math.max(maxStreak, right-left+1);
        }
        
        return maxStreak;
    }   
}
