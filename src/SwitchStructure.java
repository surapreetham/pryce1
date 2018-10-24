import java.util.Scanner;

   public class SwitchStructure{
      
       public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);
           System.out.println("Enter value1 : ");
             int value1 = sc.nextInt();
           System.out.println("Enter value2 : ");
             int value2 = sc.nextInt();
           
         System.out.println("Enter a key : ");
          int key =  sc.nextInt();

          switch(key){
              case 1: 
                           System.out.println("Addition of value1 and value2 is : "+(value1+value2));  
                           break;
             case 2: 
                           System.out.println("Subtraction of value1 and value2 is : "+(value1-value2));  
                         break;
                           
               case 3: 
                           System.out.println("Multiplication of value1 and value2 is : "+(value1*value2));  
                           break;
              case 4: 
                           System.out.println("Division of value1 and value2 is : "+(value1%value2));  
                           break;
              default: 
                          System.out.println("No other operations done beyond the valid keys from 1 to 4 ");  
                            
          }
            
       }
  }


