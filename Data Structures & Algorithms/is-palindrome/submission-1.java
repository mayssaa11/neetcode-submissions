class Solution {
    public boolean isPalindrome(String s) {

        if (s.length()==1) return true;

        // only keep alphanumerical characters and normalize everything into lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 

        if (s.length()==1) return true;

        String inverted = new StringBuilder(s).reverse().toString();

        if (s.equals(inverted)) return true;
        return false;
    }
}