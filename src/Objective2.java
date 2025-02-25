import java.util.Scanner;

public class Objective2 {

    public static String getStringSentence(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence with multiple words separated by spaces.");
        System.out.print("Sentence: ");
        String sentence = scan.nextLine();
        System.out.println("Your sentence: " + sentence);
        return sentence;
    }

    public static String[] getSentenceArray(String arg){
        String[] sentArray = arg.split(" ");
        return sentArray;
    }

    public static StringBuilder getSB(String[] args){
        StringBuilder sb = new StringBuilder();
        for(String word : args){
            StringBuilder wordSB = new StringBuilder(word);
            wordSB.reverse();
            sb.append(wordSB + " ");
        }
        return sb;
    }

    public static void main(String[] args) {
        String userSent = getStringSentence();
        String[] sentArray = getSentenceArray(userSent);
        StringBuilder sb = getSB(sentArray);
        System.out.println("Your sentence modified: " + sb);
    }
}
//