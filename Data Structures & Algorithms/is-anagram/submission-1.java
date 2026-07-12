class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length()!=t.length()) return false;
    
        // convert a list to an unordered collection without removing duplicates, not a stadard set
        Map<Character, Integer> bag1 = new HashMap<>();
        for (Character c : s.chars().mapToObj(c -> (char) c).toList()) {
            bag1.put(c, bag1.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> bag2 = new HashMap<>();
        for (Character c : t.chars().mapToObj(c -> (char) c).toList()) {
            bag2.put(c, bag2.getOrDefault(c, 0) + 1);
        }

        if (bag1.equals(bag2)) return true;
        return false;
    }
}
