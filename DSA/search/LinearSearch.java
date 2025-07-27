package search;
public class LinearSearch{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6};
        int target = 4;
        int result = Linear(nums,target);
        System.out.print("the index of the target number is: " + result);
    }
    public static int Linear(int nums[] , int target){
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
    return -1;
    }
}