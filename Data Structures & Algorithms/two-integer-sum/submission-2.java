class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        HashMap<Integer, Integer> hashNums = new HashMap<>();
        for (int i=0; i<n; i++){
            hashNums.put(nums[i], i);
        }

        for (int i=0; i<n; i++){
            int diff = target-nums[i];
            if (hashNums.containsKey(diff)){
                int j = hashNums.get(diff);
                if (j!=i)
                    return new int[]{i, j};
            }
        }

        return new int[]{};
    }
}
