class Solution {
    public static final String[] GW = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    public static final String[] SW = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    public static final String[] BW = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    public static final String[] QW = {"M","MM","MMM"};
    public static final char[] WW = {'I','V','X','L','C','D','M','H'};
    public int romanToInt(String s) {
        char[] sArray = s.toCharArray();
        int h = 0;
        String res = getInt(sArray,WW[h],WW[h+1],h);
        int result = Integer.parseInt(res);
        return result;
    }
    private String getInt(char[] arr,char A,char B,int h){
        String r = "";
        String ns = "";
        char[] newArr = {};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == A || arr[i] == B){
                for(int j=i;j<arr.length;j++){
                    ns += arr[j];
                }
                if(h == 0) {
                    for (int k = 0; k < GW.length; k++) {
                        if (ns == GW[k]) {
                            String sk = (k + 1) + "";
                            r += sk;
                        }
                    }
                }else if(h == 2){
                    for (int k = 0; k < SW.length; k++) {
                        if (ns == SW[k]) {
                            String sk = (k + 1) + "";
                            r += sk;
                        }
                    }
                }else if(h == 4){
                    for (int k = 0; k < BW.length; k++) {
                        if (ns == BW[k]) {
                            String sk = (k + 1) + "";
                            r += sk;
                        }
                    }
                }else if(h == 6){
                    for (int k = 0; k < QW.length; k++) {
                        if (ns == QW[k]) {
                            String sk = (k + 1) + "";
                            r += sk;
                        }
                    }
                }
                h += 2;
                if(h>6){
                    break;
                }
                if(newArr.length>0){
                    getInt(newArr,WW[h],WW[h+1],h);
                }
            }else {
                newArr[i] = arr[i];
            }
        }
        return r;
    }
}