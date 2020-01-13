class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> intList = new ArrayList<>();
                        boolean flag = true;
                        intList.add(nums[i]);
                        intList.add(nums[j]);
                        intList.add(nums[k]);
                        Collections.sort(intList);
                        if(list.size() == 0){
                            list.add(intList);
                        }
                        for(int m=0;m<list.size();m++){
                            if(list.get(m).equals(intList)){
                                flag = false;
                                break;
                            }
                        }
                        if(flag){
                            list.add(intList);
                        }
                        flag = true;
                    }
                }
            }
        }
        return list;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(0);
        intList.add(0);
        List<Integer> intList2 = new ArrayList<>();
        intList2.add(-4);
        intList2.add(4);
        intList2.add(0);
        if(intList.containsAll(intList2)){
            list.add(intList);
        }
        return list;
    }
}

[-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0]
        输出
        [[-4,1,3],[-4,4,0],[-2,1,1],[-2,4,-2],[1,-5,4]]
        预期结果
        [[-5,1,4],[-4,0,4],[-4,1,3],[-2,-2,4],[-2,1,1],[0,0,0]]

        [[-4,1,3],[-4,1,3],[-4,4,0],[-4,4,0],[-4,4,0],[-4,0,4],[-4,4,0],[-4,4,0],[-4,3,1],[-2,1,1],[-2,4,-2],[-2,4,-2],[-2,-2,4],
        [-2,4,-2],[1,-5,4],[1,-5,4],[1,-4,3],[1,-4,3],[1,4,-5],[1,-2,1],[1,4,-5],[1,-2,1],[-5,4,1],[-5,4,1],[-4,4,0],[-4,4,0],[-4,4,0],[-4,0,4],[-4,4,0],[-4,4,0],[-4,3,1],
        [-4,4,0],[-4,4,0],[-4,4,0],[-4,0,4],[-4,4,0],[-4,4,0],[-4,3,1],[4,-2,-2],[4,1,-5],[-2,4,-2],[0,0,0],[4,1,-5]]