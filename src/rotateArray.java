public class rotateArray {
    public  static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,6};
        //                   {4,5,6,1,2,3}
        int k =3;
        k=k%arr.length;
        int n = arr.length;

        int arr1[] = new int[n];
        for(int i =0;i<=k-1;i++){
            arr1[i] = arr[k+i+1];
        }
        for(int i=0;i<arr.length-k;i++){
            arr1[k+i] = arr[i];
        }
        for(int i =0;i<arr.length;i++){
        System.out.println(arr1[i] +" ");
    }}
}
