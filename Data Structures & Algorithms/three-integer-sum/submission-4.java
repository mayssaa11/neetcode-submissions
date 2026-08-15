class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> output = new HashSet<>();

        Set<Integer> set = new HashSet<>();
        for (int i=0; i<n-2; i++){
            // for each i perform the same logic as 2sum with target: -nums[i]
            set.clear();
            for (int j=i+1; j<n; j++){
                int complement = -nums[i]-nums[j];
                if (set.contains(complement)){ 
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    output.add(triplet);
                } else {
                    set.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(output);        
    }
}
