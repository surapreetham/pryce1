class Palindrome{
      static int i;
      static String str = "";
     public static void main(String[] arr){
          String name = arr[0];
        
          isPalin(name);
        for(i=name.length()-1;i>=0;i--){
           str = str+name.charAt(i);
        }
     }
         public static boolean isPalin(String name){ 
           if(str.equals(name)){
               System.out.println("palindrome");
           }
           else{
           System.out.println("not palindrome");
           }
         return true;
     }
}

