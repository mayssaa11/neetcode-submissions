class Solution {
    public int maxArea(int[] heights) {

        int maxWaterAmount = 0;
        
        int left = 0;
        int right = heights.length-1;
        while (left < right){
            maxWaterAmount = Math.max(maxWaterAmount, (right-left)*Math.min(heights[left], heights[right]));
            // Move the pointer with the smaller height inward
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWaterAmount;
    }
}
