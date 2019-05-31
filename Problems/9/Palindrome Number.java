class Solution {
    public boolean isPalindrome(int x) {
        String ss = x+"";
        int ssLength = ss.length();
        char[] ssArray = ss.toCharArray();
        for(int p=0;p<ssLength/2;p++){
            if(ssArray[p] != ssArray[ssLength-p-1]){
                return false;
            }
        }
        return true;
    }
}