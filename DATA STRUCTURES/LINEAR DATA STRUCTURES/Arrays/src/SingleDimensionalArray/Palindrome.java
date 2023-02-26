package SingleDimensionalArray;
import java.util.Scanner;
import java.util.regex.*;
public class Palindrome {
    static Pattern pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word, message;
        char [] letters;
        int countLetters;

        System.out.println("Enter your word:" );
        word = sc.nextLine().toLowerCase();

        countLetters = countLetters(word.trim());
        letters = decompose(word, countLetters);
        message = checkWord(letters, countLetters) ? "The word is palindrome" : "The word is not palindrome";

        System.out.println("Word ---> " + String.valueOf(letters) + "\n " + message);
    }

    public static int countLetters(String word){
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if(pattern.matcher(String.valueOf(word.charAt(i))).matches()) count++;
        }
        return count;
    }

    public static char[] decompose(String word, int nChar){
        //String decomposeWord = "";
        int i, add;
        i = add = 0;
        char[] letters = new char[nChar];


        while(add != nChar){
            if(pattern.matcher(String.valueOf(word.charAt(i))).matches()){
                letters[add] = word.charAt(i);
                add++;
            }
            i++;
        }

       // decomposeWord = String.copyValueOf(letters); //String.copyValueOf() return a String of all characters stored in the array

        return letters;
    }

    public static boolean checkWord(char[] letters, int nChar){
        char [] reverseWordLetter = new char[nChar];
        int count = 0;

        for (int i = (letters.length - 1); i >= 0; i--) {
            reverseWordLetter[count] = letters[i];
            count++;
        }
        return reviewEquality(letters, reverseWordLetter);
    }

    public static boolean reviewEquality(char[] word, char [] wordReverse){
        int i = 0;
        while (i < word.length){
            if (word[i] == wordReverse[i]) {
                i++;
            }
            else
                return false;
        }
        return true;
    }
}
