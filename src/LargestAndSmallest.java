public class LargestAndSmallest {
    public  static void main(String[] args) {
        int arr[] = new int[]{23,54,34,11,89,4,10};
        // Smallest = 4  Largest = 89
        int small =  arr[0];
        int large = arr[0];
        for(int i =0;i<arr.length;i++){
            if(small>arr[i]){
                small = arr[i];
            }
            if(large<arr[i]){
                large = arr[i];
            }
        }
        System.out.println("Smallest : "+ small+  " Largest : "+ large);
    }
}
