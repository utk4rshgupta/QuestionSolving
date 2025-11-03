public class ArrayIntersection {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5,6};
        int arr2[] = new int[]{7,8,9,10};
        int n = arr1.length;
        int m = arr2.length;
        int arr[] = new int[m+n];
        for(int i =0;i<n;i++){
            arr[i] = arr1[i];
        }
        for(int i = 0;i<m;i++){
            arr[i+n]= arr2[i];
        }
        for (int i =0;i<arr.length;i++) {
            System.out.println(arr[i] +" ");
        }
}
}
