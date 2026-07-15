class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] output = new int[n]; //initialized with zeros by default

        int null_counts = 0;
        for (int i=0; i<n; i++){
            if (nums[i]==0) 
                null_counts += 1;
        } 

        if (null_counts>=2) 
            return output;

        // else: null_counts is either 1 or 0
        int product = 1;
        int null_index = -1;
        for (int i=0; i<n; i++){
            if (nums[i]!=0) 
                product *= nums[i];
            else {
                // nums[i]==0 only if null_counts==1
                null_index = i;
            }
        } 

        if (null_counts==1){
            output[null_index] = product;
            return output;
        }

        // else: null_counts==0
        for (int i=0; i<n; i++){
            output[i] = product/nums[i];
        }
        return output;

    }
}  
