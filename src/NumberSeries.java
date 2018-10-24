import java.util.Scanner;
class NumberSeries{
       public static void main(String[] arr){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number : ");
            int number = sc.nextInt();
            int a=1,b=2;
           int c = 0;
          System.out.print(" "+a);
             for(int i=0;i<number;i++){
                c = a*b;
                a = b;
                b = c;
                System.out.print(" "+c);  
             }
       
      }

}