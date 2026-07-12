class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        for (int i=0; i<nums.length; i++){
            if (ht.containsKey(nums[i])){
                return true;
            } else ht.put(nums[i],1);
        }
        return false;
    }
}