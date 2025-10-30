public class freqInArray {
    static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for(int i =0;i<=arr.length-1;i++){
            int count =1;
            for(int j=0;j<=arr.length-1;j++){
                if(i!=j && arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("freq of " +arr[i] + " is : "+count);
        }
    }
}
