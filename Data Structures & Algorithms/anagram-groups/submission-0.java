class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> groupedAnagrams = new ArrayList<>();

        for (String x: strs){
            boolean newAnagram = true;
            for (int i=0; i<groupedAnagrams.size(); i++){
                if (areAnagrams(groupedAnagrams.get(i).get(0),x)){
                    newAnagram = false;
                    groupedAnagrams.get(i).add(x);
                    break;
                }
            }
            if (newAnagram) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(x);
                groupedAnagrams.add(newGroup);
            }
        }
        return groupedAnagrams;
    }

    public boolean areAnagrams(String s, String t) {
        
        if (s.length()!=t.length()) return false;

        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
