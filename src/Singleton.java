class Singleton{
     private Singleton(){
         System.out.println("hello Zero");
        }
        Singleton(int i){
          System.out.println("hello Para");
        }
     public static void main(String[] arr){
         Singleton s = new Singleton();  
         Singleton s1 = new Singleton(10);
         Singleton s2 = new Singleton();   
    }
}
class Single extends Singleton{


}