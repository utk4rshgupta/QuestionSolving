public class uniChar {
    public static void main(String[] args) {
        String str = "abcad";
        System.out.println(unique(str));
    }

    static boolean unique(String str){
        for(int i=0;i<str.length();i++){
            for(int j =0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    return false;
                }
            }

        }
        return true;
    }
}
