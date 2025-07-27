package sorting;

public class SelectionSort {
    public static void main(String[] args){
        int nums[] = {2,4,6,5,1,3,8,9};
        int size = nums.length;
        int minIndex = -1;
        int temp = 0;
        System.out.println("Before sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }

        //algorithm for selection sort 
        for(int i = 0;i<size-1;i++){
            minIndex = i;
            for(int j = i + 1;j<size;j++){
                if(nums[minIndex] > nums[j]){
                    minIndex =j;
                } //inner loop is to find the index of the minimum value  
                
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.println();
        System.out.println("After sorting using selection sort: ");
        for(int num : nums){
            System.out.print(num + " ");
        }

    }    
}
