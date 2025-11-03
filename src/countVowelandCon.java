public class countVowelandCon {
    public  static void main(String[] args) {
        String str = "Utkarsh";
        int vowelCount =0;
        int ConsCount =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                vowelCount++;
            }
        }
        System.out.println("No. of Vowel: "+vowelCount);
        System.out.println("No. of Consonant: " +(str.length()-vowelCount));
    }
}
