class Solution {
    public int reverse(int x) {
        String s = x+"";
        char[] sArray = s.toCharArray();
        int sLength = sArray.length;
        String ns = "";
        for(int i=0;i<(x<0?sLength-1:sLength);i++){
            ns += sArray[sLength-i-1];
        }
        int res;
        //尝试转换成int，超出范围会报错
        try{
            res = Integer.parseInt(ns);
        }catch (Exception e){
            res = 0;
        }
        if(x<0){
            res *=-1;
        }
        return res;
    }
}