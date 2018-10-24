import java.util.*;
class PrimeDemo{
     public static void main(String[] arr){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      int number = sc.nextInt();
        
      int i=0;
          for(i=1;i<=number;i++){
          int count = 0;
          // int cn = i;
              for(int j=1;j<=i;j++){
                if(i%j==0){
                 
                  count++;
                 }  
         }
             if(count==2){
              System.out.print(" "+i);
             }
           }
        /*     else{
              System.out.println("Given number is Not-Palindrome");
             }
          */
    }
}