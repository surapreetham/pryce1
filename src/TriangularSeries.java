import java.util.*;
class TriangularSeries{
   public static void main(String[] arr){
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter a Number ");
       int number = sc.nextInt();
     
        for(int i=0;i<=number;i++){
           int c = i*(i+1);
        System.out.print(" "+c);
        } 
   }
}