package at.fhj.msd;

public class IsPalindrome {

    public static boolean ispali(String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}