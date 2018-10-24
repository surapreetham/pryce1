import java.util.Scanner;
class Squares{
      public static void main(String[] arr){
       Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int i = 0;
          for(i=2;i<=number;i++){  
           int squares = i*i*i;
           System.out.print("  "+squares);
           
          } 
             
     }
}