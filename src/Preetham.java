class Preetham{
      int a=0,b=1;
       int c;
      void display(int n){
        while(n>0){
         display(n-1);
          c = a+b;
           a = b ;
           b = c;
            System.out.println(" "+c);
            }
      }
   public static void main(String[]arr){
    int n = 50;
    Preetham p=new Preetham();

    p.display(n-2);
        
       
   }
}