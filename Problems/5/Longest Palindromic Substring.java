class Solution {
    public String longestPalindrome(String s) {
        char[] sArray = s.toCharArray();
        int sLength = sArray.length;
        int a=0,b=0;
        if(sLength < 2){
            return s;
        }
        for(int i=0;i<sLength;i++){
            for(int j=sLength-1;j>i;j--){
                if(sArray[i] == sArray[j]){
                    if((j-i)>=(b-a)){
                        if(ishw(s.substring(i,j+1)) == "Y"){
                            b=j;
                            a=i;
                        }
                    }
                }
            }
        }
        return s.substring(a,b+1);
    }
    public String ishw(String ss){
        int ssLength = ss.length();
        char[] ssArray = ss.toCharArray();
        String result = "Y";
        for(int p=0;p<ssLength/2;p++){
            if(ssArray[p] != ssArray[ssLength-p-1]){
                result = "N";
                break;
            }
        }
        return result;
    }
}