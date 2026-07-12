class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(k) 
            .mapToInt(Map.Entry::getKey) 
            .toArray();
        
    }
}
