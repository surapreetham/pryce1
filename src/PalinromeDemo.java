class PalinromeDemo{
    public static void main(String[] arr){
       String input = arr[0];
       String reverse = "";
       for(int i=input.length()-1;i>=0;i--){
         reverse = reverse+input.charAt(i);
       }
        if(input.equalsIgnoreCase(reverse)){
           System.out.println("Entered Input String is Palindrome");
        }
        else{
          System.out.println("Entered Input String is Not-Palindrome");
        }
    }
}