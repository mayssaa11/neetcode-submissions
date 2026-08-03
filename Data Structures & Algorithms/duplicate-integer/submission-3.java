class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        //naive approach

        int n = nums.length;
        if (n<2) return false;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }                
        }
        return false;
    }
}