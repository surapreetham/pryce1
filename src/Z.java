public class Z {
   static int i = 10;
    {
       System.out.println("instance block");
     }
     static {
         
            System.out.println("static block"+i);
     }
    void test(){
      System.out.println("test()");
         
    }
      
       public static void main(String[] args){
            Z obj = new Z();       
         System.out.println("main begin");
           Z obj1 = new Z();
         obj.test();
           Z obj2 = new Z();
          obj.test();
           new Z();

      }
      
}