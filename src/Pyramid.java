class Pyramid{
      public static void main(String[] arr){
         int a = Integer.parseInt(arr[0]);
          try{
                if(a==0){
                  System.out.println(a+" : Neither an Even nor an Odd ");
                }
              else if(a%2==0){
                System.out.println(a+" : is an Even number ");
               }   
               else{
                  System.out.println(a+" : is an Odd Number");   
               }
          }
         catch(Exception e){
          System.out.println("please enter a digit to check whether it is an Odd or an Even");
         
         }      
            
      }
}

