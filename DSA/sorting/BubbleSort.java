package sorting;
public class BubbleSort {

    public static void main(String[] args) {
        int nums[] = {1,4,2,3,5,7,6,8};
        int size = nums.length;
        int temp = 0;
        System.out.println("Before sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }

        //algorithm
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("after sorting");
        for(int num : nums){
            System.out.print(num + " ");
        }
     
    }

    
}