class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //sorted array

        int n = nums.length;
        if (n<2) return false;

        Arrays.sort(nums);
        for (int i=0; i<n-1; i++){
            if (nums[i]==nums[i+1]){
                return true;
            }               
        }
        return false;

    }
}