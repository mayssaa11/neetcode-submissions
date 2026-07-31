class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j=0; j<n; j++){
            int diff = target-nums[j];
            if (map.containsKey(diff)){
                return new int[]{map.get(diff), j}; // i<j
            }
            map.put(nums[j], j);
        }

        return new int[]{};
    }
}
