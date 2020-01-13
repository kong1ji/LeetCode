class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int strsLen = strs.length;
        int minPosi = 0;
        for(int k=1;k<strsLen;k++){
            if(strs[k].length()<strs[minPosi].length()){
                minPosi = k;
            }
        }
        for(int i=0;i<strs[minPosi].length();i++){
            for(int j=0;j<strsLen;j++){
                if(strs[minPosi].charAt(i) != strs[j].charAt(i)){
                    return strs[minPosi].substring(0,i);
                }
            }
        }
        return strs[minPosi];
    }
}