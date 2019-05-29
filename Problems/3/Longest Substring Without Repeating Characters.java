class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] sArray = s.toCharArray();
        int sl = sArray.length;
        int r = 0,res = 0;
        if(sl == 0){
            return 0;
        }else if(sl == 1){
            return 1;
        }
        for(int i=1;i<sl;i++){
            for(int j=0;j<i;j++){
                r = j+2;
                if(sArray[i] == sArray[j]){
                    r--;
                    s = s.substring(j+1,sl);
                    sArray = s.toCharArray();
                    sl = sArray.length;
                    i=0;
                    break;
                }
            }
            res = res>r?res:r;
        }
        return res;
    }
}