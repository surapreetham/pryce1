class Swap{
     public static void main(String[] arr){
      int num1=10;
       int num2=5;
       
        System.out.println("num1= "+num1+" before swapping");
        System.out.println("num2 = "+num2+" before swapping");
      
           num1 = num1^num2;
           num2 = num1^num2;
           num1 = num1^num2;
       
        System.out.println("num1= "+num1+" after swapping");
        System.out.println("num2 = "+num2+" after swapping");
     }
}