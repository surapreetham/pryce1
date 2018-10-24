class Print{
         static int  a=1;
     
       public static void main(String[] arr){
          disp(10);       
       }
       
        public static int disp(int n){
          if(a<n){
            disp(n-1);  
              a++;
            
          }
          System.out.print(" "+a);
      return (n=n-1);
   }
}