package search;
public class BinarySearch{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int target = 5;
        int result = binary(nums,target);
        System.out.print("the index of the number in the array is: " + result);
    }
    public static int binary(int nums[] , int target){
        int left = 0;
        int right = nums.length - 1;
        while (left<=right) {
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target<mid){
                right = mid + 1;
            }else{
                left = mid - 1;
            }
               
        }
    return -1;
    }
}