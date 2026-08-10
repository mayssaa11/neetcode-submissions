class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c,0)+1);
            c = t.charAt(i);
            mapT.put(c, mapT.getOrDefault(c,0)+1);
        }

        return mapS.equals(mapT);
    }
}
