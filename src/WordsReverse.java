
import java.util.Scanner;

public class WordsReverse {
    Scanner read=new Scanner(System.in);
    String stringWords;
    String[] words;
    public void enterString(){
        System.out.println("Enter the string: ");
        this.stringWords=this.read.nextLine();
        this.words=this.stringWords.split(" ");
        analizeWords();
        constructString();
    }

    public void analizeWords(){
        int j=0;
        for(String word:this.words){
            if(word.length()>4){
                word=invertWord(word);
                this.words[j]=word;
            }
            j++;
        }
    }

    public String invertWord(String inputWord){
        String aux="";
        for(int i=inputWord.length()-1;i>=0;i--){
            aux+=inputWord.charAt(i);
        }
        
        return aux;
    }

    public void constructString(){
        for(String word:this.words){
            System.out.print(word+" ");
        }
    }
}
