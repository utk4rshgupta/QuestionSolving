public class searchInrotated {
    public static void main(String[] args) {
        int[] nums ={4,5,6,7,0,1,2};
        int a = peakIndexInMountainArray(nums);
        System.out.println(a);
        System.out.println( binarysearch(nums,0,3,6));
    }
    public  static int binarysearch(int arr[],int first,int last,int target){
        //int first =0 , last=arr.length-1;
        while(first<last){
            int mid=first+(last-first)/2;
                if(arr[mid]==target){
                    return mid;
                }else if(arr[mid]>target){
                    first =  mid+1;
                }else{
                    last  =  mid-1;
                }

                }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int left =0 , right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;

            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else
                right = mid;

        }
        return left;

    }
}
