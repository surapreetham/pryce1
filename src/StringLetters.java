import java.util.*;
class StringLetters{
       static int count = 0;
       static int index = 0;
      static public int letterCount(String str){
          while(index<str.length()){
             if(str.charAt(index)!=' '){
                 count++;
              }
            index++;
          }
        return count;
       }
       public static void main(String[] arr){
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");

        String name = sc.nextLine();
         
         System.out.println("Number of letters in the given String are :"+letterCount(name));      
     }
}