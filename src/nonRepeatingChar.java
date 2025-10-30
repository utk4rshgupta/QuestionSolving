 class nonRepeatingChar {
    public static void main(String[] args) {
        String str =  "utkatkrsharshu";
        System.out.println(non(str));

    }
    static char non(String str){
        char ch = ' ';
        for(int i =0;i<str.length();i++){
            int count =0;
            for(int j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                return str.charAt(i);
            }
        }
        return ' ';
    }
    }
