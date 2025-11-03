public class freqElement {
    public static void main(String args[]) {
        int arr[] = new int[]{1,2,3,4,5,4,3,3,3};
        int freqIndex = 0;
        int index=0;
        for(int i=0; i<arr.length; i++ ){
            int freq=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq++;
                    index = i;
                }
            }
            if(freq>freqIndex){

            }



        }
    }
}
