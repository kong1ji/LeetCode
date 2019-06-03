//遍历字符串，如果遇到了"I"或者"V"则，从这里开始往后的字符串都属于个位数，将这些字符串截取出来，拿去转换成整数；
//截取完个位数之后，当遇到了"X"或者"L"则后面跟着的字符串都属于十位数，同样截取出来转换成整数；
//以此类推，将字符串完全转换掉
class Solution {
    public static final String[] GW = {"I","II","III","IV","V","VI","VII","VIII","IX"};
    public static final String[] SW = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    public static final String[] BW = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    public static final String[] QW = {"M","MM","MMM"};
    public static final char[] WW = {'I','V','X','L','C','D','M','H'};
    public int romanToInt(String s) {
        int res = 0;
        for(int h=0;h<8;h+=2){
            //获取第一个遇到的数的位置
            int firstNum;
            int Num1 = s.indexOf(WW[h]);
            int Num2 = s.indexOf(WW[h+1]);
            if(Num1 == -1 && Num2 == -1){
                continue;
            }else if(Num1 == -1){
                firstNum = Num2;
            }else if(Num2 == -1){
                firstNum = Num1;
            }else {
                firstNum = Num1<Num2?Num1:Num2;
            }
            if(firstNum > -1){
                //截取字符串进行转换
                String ns = s.substring(firstNum);
                if(h == 0){
                    for(int i=0;i<GW.length;i++){
                        if(GW[i].equals(ns)){
                            res += (int)((i+1)*Math.pow(10,h/2));
                            break;
                        }
                    }
                }else if(h == 2){
                    for(int i=0;i<SW.length;i++){
                        if(SW[i].equals(ns)){
                            res += (int)((i+1)*Math.pow(10,h/2));
                            break;
                        }
                    }
                }else if(h == 4){
                    for(int i=0;i<BW.length;i++){
                        if(BW[i].equals(ns)){
                            res += (int)((i+1)*Math.pow(10,h/2));
                            break;
                        }
                    }
                }else if(h == 6){
                    for(int i=0;i<QW.length;i++){
                        if(QW[i].equals(ns)){
                            res += (int)((i+1)*Math.pow(10,h/2));
                            break;
                        }
                    }
                }
                if(firstNum == 0){
                    break;
                }else {
                    s = s.substring(0,firstNum);
                }
            }
        }
        return res;
    }
}