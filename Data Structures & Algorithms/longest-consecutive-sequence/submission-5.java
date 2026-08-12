class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Set<Integer> uniqueNums = new HashSet<>();        
        for (int num : nums) {
            uniqueNums.add(num);
        }

        int longestStreak = 0; 
        for (Integer num: uniqueNums){

            // only check against beginnings of sequences (i.e num-1 not in uniqueNums)
            if (!uniqueNums.contains(num-1)){
                
                int currentStreak = 1;
                while (uniqueNums.contains(++num)) {
                    currentStreak++;               
                }
                longestStreak = Math.max(longestStreak,currentStreak);
            }
        }

        return longestStreak;
    }
}