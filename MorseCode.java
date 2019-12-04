import java.util.Arrays;
import java.util.Scanner;

public class MorseCode {

    static String[] letters =
            { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0","!", ",", "?", ".", "'",};

    static String[] morse =
            { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----","-.-.--", "--..--", "..--..", ".-.-.-", ".----.",};

    public static void main(String[] args)
    {

        System.out.println(morseToLetters("Hi there"));
        System.out.println(lettersToMorse(".... ..   - .... . .-. . "));
    }

    public static String lettersToMorse(String morseCode)
    {
        String output = "";
        String convert = morseCode.trim();
        String[] words = convert.split("   ");
        for (String word : words) {
            for(String letter : word.split(" ")){
                for(int x=0;x<morse.length;x++){
                    if(letter.equals(morse[x]))
                        output=output+letters[x];
                }
            }
            output+=" ";
        }
        return output.toUpperCase();
    }
    public static String morseToLetters(String letterCode) {
        String output = "";
        String convert = letterCode.trim();
        String[] words = convert.split(" ");
        for(String word : words){
            for(int i=0;i<word.length();i++){
                for(int x=0; x<morse.length;x++){
                    if(word.substring(i, i+1).equalsIgnoreCase(letters[x])){
                        output=output+morse[x]+" ";
                    }
                }
            }
            output+="  ";
        }
        return output;
    }

}