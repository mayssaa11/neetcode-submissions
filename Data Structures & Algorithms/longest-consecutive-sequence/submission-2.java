class Solution {
    public int longestConsecutive(int[] nums) {
        // Edge case: empty array has no consecutive sequence
        if (nums.length == 0) return 0;

        // Store all unique numbers for O(1) lookups
        Set<Integer> uniqueNums = new HashSet<>();        
        for (int num : nums) {
            uniqueNums.add(num);
        }

        int longestStreak = 0;  // Tracks the maximum consecutive sequence length found
        
        // Continue until we've processed all numbers
        while (!uniqueNums.isEmpty()){
            
            // Find the smallest number remaining - this will be the start of a sequence
            // NOTE: Collections.min() is O(n) operation, making this O(n²) overall!
            int currentNum = Collections.min(uniqueNums);
            int currentStreak = 0;
            
            // Count consecutive numbers starting from currentNum
            while (true) {
                if (uniqueNums.contains(currentNum)) {
                    uniqueNums.remove(currentNum);  // Remove to avoid reprocessing
                    currentNum++;                    // Move to next number
                    currentStreak++;                 // Increment streak length
                } else {
                    break;  // Sequence ended
                }
            }
            // Update longest streak if current one is longer
            longestStreak = Math.max(longestStreak,currentStreak);
        }
        return longestStreak;
    }
}