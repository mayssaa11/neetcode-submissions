class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (map.containsKey(key)){
                map.get(key).add(s);
            } else {
                map.put(key, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList(map.values());
    }
}
