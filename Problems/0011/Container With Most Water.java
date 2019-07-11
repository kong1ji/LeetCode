class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int h = 0;
        int w = 0;
        int area = 0;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                h = height[i]<height[j]?height[i]:height[j];
                w = j-i;
                if(h*w>area){
                    area = h*w;
                }
            }
        }
        return area;
    }
}