class MyThread extends Thread{
     public void run(){
         System.out.println("run");
     }       
      public void start(){
          super.start();
          System.out.println("start");
         }
}
class ThreadDemo{
    public static void main(String[] arr){
         MyThread t = new MyThread();
         t.start();
         System.out.println("Main thread");
   }  
}