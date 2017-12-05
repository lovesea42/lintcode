package com.brianxia.lintcode;

/**
 * @author xiadong
 */
public class PartitionArray373 {

    public void partitionArray(int[] nums) {
        // write your code here

        int[] evenback = new int[nums.length];
        int evencount = 0;
        int index = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] % 2 == 0){
                evenback[evencount++] = nums[i];
            }else{
                nums[index++] = nums[i];
            }

        }

        for(int i = 0;i < evencount;i++){
            nums[index++] = evenback[i];
        }
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,3,2,4};
        PartitionArray373 aa = new PartitionArray373();
        aa.partitionArray(test);
        for(int i = 0;i < test.length;i++){
            System.out.println(test[i]);
        }
    }

}
