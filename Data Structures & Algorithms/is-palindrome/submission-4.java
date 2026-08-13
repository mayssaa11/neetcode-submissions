class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.length()==1) return true;

        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (Character.isLetterOrDigit(s.charAt(left))){
                if (Character.isLetterOrDigit(s.charAt(right))){
                    if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                        return false;
                    left++;
                    right--;
                } 
                else right--;         
            } 
            else left++;
        }

        return true;
    }
}
