class Solution {
    public boolean isAlphaNumeric(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
    public boolean isPalindrome(String t) {
        String s = t.toLowerCase();
        int low = 0; int high = s.length() - 1;

        while(low <= high){
            if(!isAlphaNumeric(s.charAt(low))){
                low++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(high))){
                high--;
                continue;
            }
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            else{
                low++;
                high--;
            }
        }
        return true;
    }
}
