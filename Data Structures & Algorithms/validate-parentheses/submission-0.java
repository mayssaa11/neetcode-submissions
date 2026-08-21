class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();

        Map<Character, Character> corresponding = new HashMap<>();
        // key: open bracket, value: corresponding close bracket
        corresponding.put('(',')');
        corresponding.put('{','}');
        corresponding.put('[',']');

        for (char c: s.toCharArray()){
            if (corresponding.keySet().contains(c)){
                // only open brackets are added to the stack
                stack.push(c);
            }
            else if (corresponding.values().contains(c)) {
                if (stack.isEmpty()) 
                    return false;
                if (c != corresponding.get(stack.peek())) 
                    return false;
                // remove the last open bracket from the stack 
                // if c (current close bracket) is the corresponding close bracket
                stack.pop();
            }
            else return false;
        }

        return stack.isEmpty();
    }
}
