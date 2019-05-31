class Solution {
    public static final String[] GW = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    public static final String[] SW = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    public static final String[] BW = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    public static final String[] QW = {"M","MM","MMM"};
    public String intToRoman(int num) {
        String s = num+"";
        String res = "";
        char[] sArray = s.toCharArray();
        int sLength = s.length();
        for(int i=0;i<sLength;i++){
            res += getRoman(sArray[i],sLength-i);
        }
        return res;
    }
    private String getRoman(char c,int l){
        int ci = (int)c - (int)('0');
        String result = "";
        if(ci == 0){
            return "";
        }
        switch (l){
            case 1:  result = GW[ci-1];break;
            case 2:  result = SW[ci-1];break;
            case 3:  result = BW[ci-1];break;
            case 4:  result = QW[ci-1];break;
        }
        return result;
    }
}