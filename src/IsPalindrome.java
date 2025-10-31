public class IsPalindrome {
    static void main(String[] args) {
        String str = "raceca";
        System.out.println(ispalindrome(str));

    }
    static boolean ispalindrome(String str){
        int first = 0,last =  str.length()-1;
        while(first<=last) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(first) != str.charAt(last)) {
                    return false;

                }
                first++;
                last--;
            }
        }
        return true;
    }
}
