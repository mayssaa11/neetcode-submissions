class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);

        Set<List<Integer>> output = new HashSet<>();

        for (int i=0; i<n-2; i++){
            // for each i perform the same logic as 2sum with target -nums[i]
            int left = i+1;
            int right = n-1;
            while (left<right){
                if (nums[i]+nums[left]+nums[right]==0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    output.add(triplet);
                    // since there may be many triplets with nums[i], 
                    // we can't just break the loop yet until we make sure no other possible triplet is left
                    // we can either increment left or decrement right
                    left++;
                } else {
                    if (nums[i]+nums[left]+nums[right]<0){
                        // nums[i] is fixed, so we have to increment left to increase the sum
                        left++;
                    } else {
                        // nums[i]+nums[left]+nums[right]>0, decrement right to decrease the sum
                        right--;
                    }
                }
                
            }   
        }
        return new ArrayList<>(output);        
    }
}
