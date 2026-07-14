class Solution {
    public boolean isPalindrome(String s) {

        if (s.length()==1) return true;

        // only keep alphanumerical characters and normalize everything into lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 

        int n = s.length();
        for (int i=0; i<n/2; i++){
            if (s.charAt(i)!=s.charAt(n-1-i)) return false;
        }
        return true;
    }
}