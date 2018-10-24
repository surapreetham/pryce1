class Ternary{
   public static void main(String[] arr){
     int temp=0, result=0;
     int a=190,b=120,c=100;

     temp = a > b ? a : b;
     result = c > temp ? c : temp;
 
     System.out.println("largest number is : "+result);   
   }
}