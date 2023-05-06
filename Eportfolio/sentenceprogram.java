import java.util.Scanner;
        
public class sentenceprogram {
    
    public static void main(String[] args) {
        
        Scanner scannerIn = new Scanner(System.in);
        int i = 5;
        while(i!= 9){   
        System.out.println("(1) Enter a full sentence."); 
        System.out.println("(2) Print out all sentences entered so far in the given order."); 
        System.out.println("(3) Print out all sentences entered thus far in the reverse order."); 
        System.out.println("(4) Print out the number of sentences that have been entered so far."); 
        System.out.println("(5) Print out the number of characters in all sentences combined."); 
        System.out.println("(6) Calculate the total number of vowels contained in all stored sentences."); 
        System.out.println("(7) Perform search for a given word using case sensitive comparisons."); 
        System.out.println("(8) Perform search for a given word using case insensitive comparisons."); 
        System.out.println("(9) End program.");
        i = scannerIn.nextInt(i);
        }
        } 
}