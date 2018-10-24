import java.util.*;
class WordsCount{
  public static void main(String[] arr){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String : ");
      String sentence = sc.nextLine();
      int index = 0;
      int count = 0;
         for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){       
             count++;
             index++;
            }
          } 
        
      System.out.println("Number of word in a given sentence are : "+(count+1));
 
  }
}