class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Map<Integer, Integer> sortedMapDesc = map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(k) 
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldValue, newValue) -> oldValue,
                LinkedHashMap::new
            ));
        
        return sortedMapDesc.keySet().stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
        
    }
}
