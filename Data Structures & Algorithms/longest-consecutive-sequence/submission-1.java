class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length==0) return 0;

        Set<Integer> uniqueNums = new HashSet<>();        
        for (int num : nums) {
            uniqueNums.add(num);
        }

        int result = 0;
        int counter;
        // only verify starting from potential beginnings, ones that are not consecutive, ones marking the gaps
        while (true){
            if (uniqueNums.isEmpty()) break;
            int num = Collections.min(uniqueNums);
            counter = 0;
            while (true){
                if (uniqueNums.contains(num)){
                    uniqueNums.remove(num++);
                    counter++;
                }
                    
                else break;
            }
            if (counter>result) result=counter;
        }
        return result;
    }
}
