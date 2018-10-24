import java.util.Random;
class RandomDemo{
  static int count;
   public static void main(String[] arr){
     Random r = new Random();
      for(count=0;count<1;count++){
       count = r.nextInt(100);
      }
      
         System.out.println(count);

  }

}