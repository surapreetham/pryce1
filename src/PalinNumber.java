class PalinNumber{
         public static void main(String[] arr){
         int sum = 0;
          int number = Integer.parseInt(arr[0]);
           int temp = number;
               while(number>0){
                     int remainder = number%10;
                     sum = sum*10+remainder;
                     number = number/10;
            }    
           if(temp == sum){
             System.out.println("palindrome number");
           }
          else{
             System.out.println(" not palindrome number");
           }           
    } 
}
