package sorting;

public class MergeSort {
    //method for sorting
    public static void MergeSort(int[] arr,int l,int r){
        if(l<r){
            int mid = ((l+r)/2);
            MergeSort(arr, l ,mid);
            MergeSort(arr,mid+1,r);
            Merge(arr,l,mid,r);
        }
    }
    public static void Merge(int[] arr , int l , int mid , int r){
        int n1 = mid - l +1; //plus 1 because the index is zero 
        int n2 = r - mid;

        int larr[] = new int[n1];
        int rarr[] = new int[n2];
        //copy the array
        for(int x=0; x<n1;x++){
            larr[x] = arr[l+x];
        }
        for(int x=0; x<n2 ; x++){
            rarr[x] = arr[mid+1 +x]; 
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(larr[i] < rarr[j]){
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
    
    public static void main(String[] args){
        int arr[] = {3,5,4,6,7,1,56,13,51,64,21,67,43,14,251,75,9};
        //before sorting
        System.out.println("before sorting");
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("after sorting");
        //sorting

        MergeSort(arr,0,arr.length-1);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
