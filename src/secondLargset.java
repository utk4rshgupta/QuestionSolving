public class secondLargset {
    static void main(String[] args) {
        int arr[] = new int[]{20, 34, 40, 22, 34, 76, 90};
        int first = arr[0], second = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (first < arr[i]) {
                second = first;
                first = arr[i];
            }
        }
        System.out.println(second);
    }
}
