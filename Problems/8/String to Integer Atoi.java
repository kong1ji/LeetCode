//48 57 43 45
class Solution {
    public int myAtoi(String str) {
        char[] strArray = str.toCharArray();
        int strLength = str.length();
        if(strLength==0){
            return 0;
        }
        int flag = 0;
        //正负符号
        int zorf = 1;
        String s = "";
        for(int i=0;i<strLength;i++){
            char c = strArray[i];
            if(c != ' '){
                flag += 1;
                String res = isNeed(c);
                //是否是第一个不为空的字符
                if(flag == 1){
                    if(res == "no"){
                        return 0;
                    }else if(res == "zheng"){
                        zorf = 1;
                    }else if(res == "fu"){
                        zorf = -1;
                    }else{
                        s += c;
                    }
                }else {
                    if(res == "num"){
                        s += c;
                    }else {
                        break;
                    }
                }
            }else if(flag > 0){
                break;
            }
        }
        int x;
        try{
            x = Integer.parseInt(s);
            x *= zorf;
        }catch (Exception e){
            x = (zorf==1?2147483647:-2147483648);
        }
        if(s == ""){
            x = 0;
        }
        return x;
    }
    //判断字符类型
    private String isNeed(char s){
        int si = (int)s;
        if(si>=48 && si<=57){
            return "num";
        }else if(si == 43){
            return "zheng";
        }else if(si == 45){
            return "fu";
        }
        return "no";
    }
}