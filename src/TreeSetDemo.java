import java.util.*;
class TreeSetDemo{
      public static void main(String[] arr){
        
       TreeSet<String> ts = new TreeSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
         String s = sc.nextLine();
          ts.add(s);
       
        System.out.println("Set : "+ts); 
       
      }
}